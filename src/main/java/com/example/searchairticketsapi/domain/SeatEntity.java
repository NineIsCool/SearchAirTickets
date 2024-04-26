package com.example.searchairticketsapi.domain;

import com.example.searchairticketsapi.domain.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@Table(name = "seat")
@FieldDefaults(level = PRIVATE)
@FieldNameConstants
@NoArgsConstructor
public class SeatEntity extends BaseEntity {
    public enum SeatClass {
        ECONOMY, COMFORT, BUSINESS
    }

    public enum Status {
        FREE, BOOKED, OCCUPIED
    }

    String number;
    SeatClass seatClass;
    Status status;
    @ManyToOne
    FlightEntity flight;
}
