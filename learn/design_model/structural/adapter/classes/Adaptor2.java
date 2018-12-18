package design_model.structural.adapter.classes;

/**
 * @program: MyStudy
 * @description: 适配器2
 * @author: Leslie
 * @create: 2018-12-17 16:44
 **/
public class Adaptor2 extends Adaptee2 implements Target{
    @Override
    public void method2() {
        System.out.println("适配器2的方法2");
    }
}
