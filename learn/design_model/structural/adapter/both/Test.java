package design_model.structural.adapter.both;

/**
 * @program: MyStudy
 * @description:
 * @author: Leslie
 * @create: 2018-12-18 10:28
 **/
public class Test {
    public static void main(String[] args) {
        Adaptor adaptee=new Adaptor(new ConcreAdaptee(),new ConcreTarget());
        adaptee.methodAdaptee();
        adaptee.methodTarget();
    }
}
