package JAVA;

abstract class Car {
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Playing music");
    }
}

abstract class WagonR extends Car {
    public void drive() {System.out.println("driving wagonR");}
}

class updatedWagonR extends WagonR {      // concrete class
    public void fly() {
        System.out.println("flying");
    }
}

public class Abstract {

    public static void main(String[] args){
        // Car car1 = new Car(); // error , we can't create a abstract class object
        Car car = new updatedWagonR();
        car.drive();
        car.playMusic();
        car.fly();
    }
}
