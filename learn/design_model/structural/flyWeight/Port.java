package design_model.structural.flyWeight;

/**
 * @program: MyStudy
 * @description: 端口，非共享
 * @author: Leslie
 * @create: 2018-12-25 11:10
 **/
public class Port {
    private String port;

    public Port(String port) {
        this.port = port;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
