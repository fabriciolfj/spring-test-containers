package com.fabriciolfj.github.springtestcontainers.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "city")
@Entity
@Builder
public class City implements Serializable {

    private static final long serialVersionUID = 8968278610359400367L;

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String country;
    private Long pop;
}
