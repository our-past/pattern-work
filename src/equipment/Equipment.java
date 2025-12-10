package equipment;


import equipment.State.State;

/**
 * 设备接口
 */
public abstract class Equipment {
    /**
     * 设备ID
     */
    String id;
    /**
     * 设备名称
     */
    String name;
    /**
     * 设备状态
     */
    State state;

    /**
     * 自检
     */
    public abstract void selfCheck();
    /**
     * 注册
     */
    public abstract void register();
    /**
     * 激活
     */
    public abstract void activate();

    /**
     * 设备启动
     */
    public final void start() {
        System.out.println("设备启动");
        selfCheck();
        System.out.println("自检完成");
        register();
        System.out.println("注册完成");
        activate();
        System.out.println("激活完成");
    }

    /**
     * 设备关闭
     */
    public final void stop() {
        System.out.println("设备关闭");
    }

    /**
     * 设备检查
     */
    public final void check() {
        System.out.println("设备检查");
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }
}
