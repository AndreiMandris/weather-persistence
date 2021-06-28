package com.example.weatherpersistence.infrastructure.mapper;

import com.example.weatherpersistence.domain.Weather;
import com.example.weatherpersistence.infrastructure.model.WeatherDto;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

public class WeatherMapper {

    public static Weather toWeather(WeatherDto weatherDto) {
        return Weather.builder()
                .base(weatherDto.getBase())
                .city(weatherDto.getCityName())
                .country(weatherDto.getCountry())
                .cloudsAll(weatherDto.getCloudsAll())
                .dateOfComputing(fromUnixTime(weatherDto.getDt()))
                .humidity(weatherDto.getHumidity())
                .pressure(weatherDto.getPressure())
                .temperature(weatherDto.getTemperature())
                .visibility(weatherDto.getVisibility())
                .windDeg(weatherDto.getWindDeg())
                .windSpeed(weatherDto.getWindSpeed())
                .build();
    }

    private static LocalDateTime fromUnixTime(Long unixTime) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(unixTime * 1000),
                        TimeZone.getDefault().toZoneId());
    }
}
