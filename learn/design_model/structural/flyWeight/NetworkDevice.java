package design_model.structural.flyWeight;

/**
 * @program: MyStudy
 * @description: 网络路由器接口 抽象享元类
 * @author: Leslie
 * @create: 2018-12-25 11:01
 **/
public interface NetworkDevice {

    String getType();

    void use(Port port);

}
