package com.example.weatherpersistence.infrastructure.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDto {

    private Double temperature;
    private Integer pressure;
    private Integer humidity;
    private String base;
    private Integer visibility;
    private Double windSpeed;
    private Integer windDeg;
    private Integer cloudsAll;
    private Long dt;
    private String country;
    private String cityName;
}
