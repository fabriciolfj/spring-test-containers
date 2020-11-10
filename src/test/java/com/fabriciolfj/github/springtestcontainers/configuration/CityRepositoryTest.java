package com.fabriciolfj.github.springtestcontainers.configuration;

import com.fabriciolfj.github.springtestcontainers.SpringTestcontainersApplicationTests;
import com.fabriciolfj.github.springtestcontainers.domain.entity.City;
import com.fabriciolfj.github.springtestcontainers.domain.repository.CityRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DisplayName("Test save city")
public class CityRepositoryTest extends SpringTestcontainersApplicationTests {

    @Autowired
    private CityRepository cityRepository;

    @Test
    public void save_city() {
        var city = City.builder()
                .country("Brazil")
                .name("Serrana")
                .pop(55000L)
                .build();

        cityRepository.save(city);
    }
}
