package com.example.weatherpersistence.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double temperature;

    @Column
    private Integer pressure;

    @Column
    private Integer humidity;

    @Column
    private String base;

    @Column
    private Integer visibility;

    @Column(name = "WIND_SPEED")
    private Double windSpeed;

    @Column(name = "WIND_DEG")
    private Integer windDeg;

    @Column(name = "CLOUDS_ALL")
    private Integer cloudsAll;

    @Column(name = "DATE_OF_COMPUTING")
    private LocalDateTime dateOfComputing;

    private String country;

    private String city;

    @CreationTimestamp
    @Column(name = "QUERIED_AT")
    private LocalDateTime queriedAt;
}
