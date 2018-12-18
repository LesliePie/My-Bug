package design_model.structural.bridge;

/**
 * @program: MyStudy
 * @description: 水泥路
 * @author: Leslie
 * @create: 2018-12-18 14:01
 **/
public class CementRoad extends Road{
    public CementRoad(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void driveOnLoad() {
        super.vehicle.drive();
        System.out.println("行驶在水泥路");
    }
}
