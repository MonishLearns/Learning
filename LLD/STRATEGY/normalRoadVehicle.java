package LLD.STRATEGY;

import LLD.STRATEGY.Strategies.NormalDriveStrategy;

public class normalRoadVehicle extends Vehicle {
    normalRoadVehicle(){
        super(new NormalDriveStrategy());
    }
}
