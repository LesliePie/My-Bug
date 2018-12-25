package design_model.structural.flyWeight;

import java.util.ArrayList;

/**
 * @program: MyStudy
 * @description: 享元工厂类
 * @author: Leslie
 * @create: 2018-12-25 11:03
 **/
public class DeviceFactory {
    private ArrayList devices = new ArrayList();
    private int totalTerminal = 0;
    public DeviceFactory() {
        NetworkDevice nd1 = new Switch("Cisco-WS-C2950-24");
        this.devices.add(nd1);
        NetworkDevice nd2 = new Hub("TP-LINK-HF8M");
        this.devices.add(nd2);
    }

    public NetworkDevice getNetworkDevice(String type) {
        if (type.equalsIgnoreCase("cisco")) {
            ++this.totalTerminal;
            return (NetworkDevice)this.devices.get(0);
        } else if (type.equalsIgnoreCase("tp")) {
            ++this.totalTerminal;
            return (NetworkDevice)this.devices.get(1);
        } else {
            return null;
        }
    }

    public int getTotalDevice() {
        return this.devices.size();
    }

    public int getTotalTerminal() {
        return this.totalTerminal;
    }
}
