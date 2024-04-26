package com.example.searchairticketsapi.domain;

import com.example.searchairticketsapi.domain.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Table(name = "flight")
@FieldDefaults(level = PRIVATE)
@FieldNameConstants
@NoArgsConstructor
public class FlightEntity extends BaseEntity {
    public enum State {
        WAITING, REGISTRATION, BOARDING, FLIGHT, DISMOUNT
    }

    @ManyToOne
    PlaneEntity planeEntity;
    LocalDateTime timeToStart;
    LocalDateTime timeToEnd;
    @ManyToOne
    AirportEntity startAirport;
    @ManyToOne
    AirportEntity endAirport;
    @OneToMany(mappedBy = "seat")
    List<SeatEntity> seats;
    State state;
}
