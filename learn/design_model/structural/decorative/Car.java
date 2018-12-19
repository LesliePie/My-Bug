package design_model.structural.decorative;

/**
 * @program: MyStudy
 * @description: 车
 * @author: Leslie
 * @create: 2018-12-19 14:09
 **/
public final class Car implements Transform{
    public Car() {
        System.out.println("我之前就是个车");
    }

    @Override
    public void move() {
        System.out.println("我会在陆地移动");
    }
}
