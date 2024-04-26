package com.example.searchairticketsapi.domain;

import com.example.searchairticketsapi.domain.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

import java.util.List;
import java.util.TimeZone;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Table(name = "airport")
@FieldDefaults(level = PRIVATE)
@FieldNameConstants
@NoArgsConstructor
public class AirportEntity extends BaseEntity {
    String name;
    String country;
    String city;
    String codeIATA;
    TimeZone timezone;
    @OneToMany(mappedBy = "flight")
    List<FlightEntity> flights;
}
