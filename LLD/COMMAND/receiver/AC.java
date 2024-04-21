package LLD.COMMAND.receiver;

public class AC {
    int temperature;
    boolean ac;

    public void turnOnAC() {
        ac= true;
        System.out.println("Turned on Ac");
    }

    public void  turnOffAC() {
        ac = false;
        System.out.println("Turned off Ac");
    }

    public void setTemperature(int temp) {
        temperature = temp;
    }
}
