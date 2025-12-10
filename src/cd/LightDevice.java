package cd;

public class LightDevice extends Device{
    public LightDevice(String name) {
        super(name);
    }
    public void turnOn(){
        this.isOn = true;
        System.out.println("Turning on " + name);
    }
    public void turnOff(){
        this.isOn = false;
        System.out.println("Turning off " + name);
    }


}
