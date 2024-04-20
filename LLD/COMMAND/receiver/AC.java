package LLD.COMMAND.receiver;

public class AC {
    int temperature;
    boolean ac;

    public void turnOnAC() {
        ac= true;
    }

    public void  turnOffAC() {
        ac = false;
    }

    public void setTemperature(int temp) {
        temperature = temp;
    }
}
