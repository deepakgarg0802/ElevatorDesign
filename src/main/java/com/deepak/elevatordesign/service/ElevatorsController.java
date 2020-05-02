package com.deepak.elevatordesign.service;

import java.util.ArrayList;
import java.util.List;

import com.deepak.elevatordesign.enums.ResponseStatus;
import com.deepak.elevatordesign.model.Elevator;
import com.deepak.elevatordesign.model.PassengerRequest;

import lombok.Data;

@Data
public class ElevatorsController {

    private List<Elevator> elevators;
    private int totalFloors;

    public ElevatorsController(final List<Elevator> elevators, final int totalFloors) {
        this.elevators = elevators;
        this.totalFloors = totalFloors;

        //distribute elevators to starting floors if not provided
        // distributeElevators()
    }

    public ResponseStatus processPassengerRequest(PassengerRequest request){
        return ResponseStatus.NOT_ACCEPTED;
    }

}
