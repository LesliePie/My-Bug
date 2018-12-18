package design_model.structural.adapter.classes;

/**
 * @program: MyStudy
 * @description: 测试
 * @author: Leslie
 * @create: 2018-12-17 16:45
 **/
public class Test {

    public static void main(String[] args) {
        try {
            Object object=Class.forName(Adaptor.class.getName()).newInstance();
            Target target= (Target) object;
            target.method1();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
