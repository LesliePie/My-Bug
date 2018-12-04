package design_model.relationship.aggregation;

/**
 * @program: oprate-AliYun
 * @description: 车
 * @author: Leslie
 * @create: 2018-12-04 10:02
 **/
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
