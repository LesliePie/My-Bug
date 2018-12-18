package design_model.structural.bridge;

/**
 * @program: MyStudy
 * @description: 客户
 * @author: Leslie
 * @create: 2018-12-18 14:03
 **/
public class Test {
    public static void main(String[] args) {
        Road road=new CementRoad(new Bus());
        road.driveOnLoad();
        Road road1=new UnpavedRold(new Car());
        road1.driveOnLoad();
    }
}
