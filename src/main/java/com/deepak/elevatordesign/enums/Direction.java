package com.deepak.elevatordesign.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum Direction {
    UPWARDS("UPWARDS"),
    DOWNWARDS("DOWNWARDS"),
    STILL("STILL");

    private String value;
}
