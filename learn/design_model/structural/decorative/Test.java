package design_model.structural.decorative;

/**
 * @program: MyStudy
 * @description: 测试
 * @author: Leslie
 * @create: 2018-12-19 14:14
 **/
public class Test {
    public static void main(String[] args) {
        Transform car=new Car();
        car.move();
        System.out.println("----------------");
        AirPlane airPlane=new AirPlane(car);
        airPlane.move();
        airPlane.fly();
        System.out.println("-----------------");
        Robot robot =new Robot(car);
        robot.move();
        robot.say();
    }
}
