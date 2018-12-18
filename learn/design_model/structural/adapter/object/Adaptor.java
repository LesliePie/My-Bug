package design_model.structural.adapter.object;

/**
 * @program: MyStudy
 * @description: 适配器
 * @author: Leslie
 * @create: 2018-12-17 17:04
 **/
public class Adaptor implements Target{
    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        adaptee.method1();
    }

    @Override
    public void method2() {
        System.out.println("方法2");
    }
}
