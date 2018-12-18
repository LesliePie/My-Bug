package design_model.structural.adapter.object;

/**
 * @program: MyStudy
 * @description: 测试
 * @author: Leslie
 * @create: 2018-12-17 17:09
 **/
public class Test {
    public static void main(String[] args) {
        Target target=new Adaptor(new Adaptee());
        target.method1();
    }
}
