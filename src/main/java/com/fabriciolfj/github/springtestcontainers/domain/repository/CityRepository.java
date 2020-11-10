package com.fabriciolfj.github.springtestcontainers.domain.repository;

import com.fabriciolfj.github.springtestcontainers.domain.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
