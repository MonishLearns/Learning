package LLD.STRATEGY;

import LLD.STRATEGY.Strategies.SpeedDriveStrategy;

public class offRoadVehicle extends Vehicle {
    offRoadVehicle(){
        super(new SpeedDriveStrategy());
    }
}
