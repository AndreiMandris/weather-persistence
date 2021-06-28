package com.example.weatherpersistence.service;

import com.example.weatherpersistence.domain.WeatherRepository;
import com.example.weatherpersistence.infrastructure.model.WeatherDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import static com.example.weatherpersistence.infrastructure.mapper.WeatherMapper.toWeather;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final WeatherRepository weatherRepository;

    @Transactional
    public void saveWeather(WeatherDto weatherDto) {
        weatherRepository.save(toWeather(weatherDto));
    }
}
