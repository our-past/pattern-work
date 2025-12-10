package cd;

// 设备组件接口（统一单个设备和设备组）
public interface DeviceComponent {
    void turnOn();
    void turnOff();
    String getStatus();
}
