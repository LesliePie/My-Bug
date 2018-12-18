package design_model.structural.adapter.classes;

/**
 * @program: MyStudy
 * @description: 适配器
 * @author: Leslie
 * @create: 2018-12-17 16:27
 **/
public class Adaptor extends Adaptee implements Target{


    @Override
    public void method2() {
        System.out.println("适配2的方法2");
    }
}
