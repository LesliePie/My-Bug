package design_model.structural.bridge;

/**
 * @program: MyStudy
 * @description: 抽象的路
 * @author: Leslie
 * @create: 2018-12-18 13:58
 **/
public abstract class Road {
    protected Vehicle vehicle;

    public Road(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract void driveOnLoad();
}
