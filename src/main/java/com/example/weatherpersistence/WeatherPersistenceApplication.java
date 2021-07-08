package com.example.weatherpersistence;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class WeatherPersistenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherPersistenceApplication.class, args);
    }

}
