package design_model.structural.adapter.singleton;

/**
 * @program: MyStudy
 * @description: 测试
 * @author: Leslie
 * @create: 2018-12-18 09:59
 **/
public class Test {
    public static void main(String[] args) {
        Target target=new Adaptee();
        target.method1();
    }
}
