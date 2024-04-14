package LLD.STRATEGY;

import LLD.STRATEGY.Strategies.DriveStrategy;

public class Vehicle{
    DriveStrategy driveObj;
    Vehicle(DriveStrategy driveObj){
        this.driveObj = driveObj;
    }

    public void drive(){
        driveObj.drive();
    }
}