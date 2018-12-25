package design_model.structural.flyWeight;

/**
 * @program: MyStudy
 * @description: 具体享元
 * @author: Leslie
 * @create: 2018-12-25 11:06
 **/
public class Hub implements NetworkDevice{
    private String type;

    public Hub(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use(Port port) {
        System.out.println("Linked by switch, type is " + this.type + ", port is " + port.getPort());
    }
}
