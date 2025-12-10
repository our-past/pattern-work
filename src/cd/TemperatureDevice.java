package cd;

public class TemperatureDevice extends Device{
    private float temperature;
    public TemperatureDevice(String name){
        super(name);
        temperature=25;
    }
}
