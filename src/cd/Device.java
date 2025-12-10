package cd;

public abstract class Device implements DeviceComponent{
    protected String name;
    proteceted boolean isOn;
    public Device(String name){
        this.name = name;
        this.isOn = false;//默认关闭
    }
    public abstract void turnOn();
    public abstract void turnOff();
    public String getStatus(){
        return String.format("设备[%s]：%s", name, isOn ? "开启" : "关闭");

    }
    public boolean isOn(){
        return isOn;
    }
}
