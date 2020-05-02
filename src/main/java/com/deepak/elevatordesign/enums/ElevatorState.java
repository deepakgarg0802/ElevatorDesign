package com.deepak.elevatordesign.enums;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public enum ElevatorState {

    UNSERVICEABLE, IDLE, DOORS_OPEN, DOORS_CLOSE, UPWARDS, DOWNWARDS;
}
