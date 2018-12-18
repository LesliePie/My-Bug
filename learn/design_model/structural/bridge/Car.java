package design_model.structural.bridge;

/**
 * @program: MyStudy
 * @description: 具体的交通工具
 * @author: Leslie
 * @create: 2018-12-18 13:57
 **/
public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("开车");
    }
}
