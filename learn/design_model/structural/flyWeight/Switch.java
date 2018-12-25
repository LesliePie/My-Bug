package design_model.structural.flyWeight;

/**
 * @program: MyStudy
 * @description: 具体享元类
 * @author: Leslie
 * @create: 2018-12-25 11:05
 **/
public class Switch  implements NetworkDevice{
    private String type;

    public Switch(String type) {
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
