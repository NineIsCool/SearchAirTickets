package com.example.searchairticketsapi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Table(name = "company")
@FieldDefaults(level = PRIVATE)
@FieldNameConstants
@NoArgsConstructor
public class CompanyEntity extends AirportEntity{

}
