package com.deepak.elevatordesign.model;

import java.util.PriorityQueue;

import com.deepak.elevatordesign.enums.Direction;
import com.deepak.elevatordesign.enums.ElevatorState;

import lombok.Data;

@Data
public class Elevator {
    private int id;

    private int currentOccupancy;
    private int capacity;

    //10,20,30
    private int speed;

    private int timeTakenForNextFloor;
    private Direction currentDirection;
    private ElevatorState elevatorState;
    private int startFloor;
    private int endFloor;
    private int upcomingFloor;
    private int lastStoppedFloor;
    private PriorityQueue<Integer> floorRequestQueue= new PriorityQueue<>();

    public int getTimeTakenForNextFloor(){
        return speed!=0?60/speed:6;
    }

    public void startElevator(Direction direction){
        this.currentDirection=direction;
    }
}
