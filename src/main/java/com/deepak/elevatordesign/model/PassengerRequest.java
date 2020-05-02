package com.deepak.elevatordesign.model;

import com.deepak.elevatordesign.enums.Direction;

import lombok.Data;

@Data
public class PassengerRequest {
    private Direction direction;
    private int floor;
    private int occupancy;
}
