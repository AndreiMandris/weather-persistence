package com.example.weatherpersistence.infrastructure;

import com.example.weatherpersistence.infrastructure.model.WeatherDto;
import com.example.weatherpersistence.service.WeatherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class WeatherListener {

    private final WeatherService weatherService;

    @SqsListener(value = "${aws.sqs.weather-queue}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void receive(final WeatherDto weatherDto) {
        log.info("Received message with payload: {}", weatherDto);
        weatherService.saveWeather(weatherDto);
    }
}
