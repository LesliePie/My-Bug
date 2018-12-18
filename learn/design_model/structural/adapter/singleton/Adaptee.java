package design_model.structural.adapter.singleton;

/**
 * @program: MyStudy
 * @description:
 * @author: Leslie
 * @create: 2018-12-17 17:42
 **/
public class Adaptee extends AbstractTarget {
    @Override
    public void method1() {
        System.out.println("默认适配方法1");
    }


}
