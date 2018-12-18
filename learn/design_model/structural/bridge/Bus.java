package design_model.structural.bridge;

/**
 * @program: MyStudy
 * @description: 公交车
 * @author: Leslie
 * @create: 2018-12-18 13:58
 **/
public class Bus implements Vehicle{
    @Override
    public void drive() {
        System.out.println("大巴");
    }
}
