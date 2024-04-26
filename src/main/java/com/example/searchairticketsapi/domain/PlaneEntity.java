package com.example.searchairticketsapi.domain;

import com.example.searchairticketsapi.domain.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDate;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Table(name = "plane")
@FieldDefaults(level = PRIVATE)
@FieldNameConstants
@NoArgsConstructor
public class PlaneEntity extends BaseEntity {
    String company;
    String model;
    LocalDate releaseDate;
    @OneToMany(mappedBy = "flight")
    List<FlightEntity> flights;
}
