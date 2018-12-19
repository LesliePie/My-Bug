package design_model.structural.decorative;

/**
 * @program: MyStudy
 * @description: 飞机
 * @author: Leslie
 * @create: 2018-12-19 14:12
 **/
public class AirPlane extends Changer{
    public AirPlane(Transform transform) {
        super(transform);
        System.out.println("变成飞机");
    }

    public void fly(){
        System.out.println("我还可以在天上飞");
    }

}
