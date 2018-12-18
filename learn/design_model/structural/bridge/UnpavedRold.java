package design_model.structural.bridge;

/**
 * @program: MyStudy
 * @description: 石子路
 * @author: Leslie
 * @create: 2018-12-18 14:00
 **/
public class UnpavedRold extends Road{
    public UnpavedRold(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void driveOnLoad() {
        super.vehicle.drive();
        System.out.println("行驶在石子路");
    }
}
