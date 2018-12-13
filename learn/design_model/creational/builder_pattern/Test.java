package design_model.creational.builder_pattern;

/**
 * @program: MyStudy
 * @description: test
 * @author: Leslie
 * @create: 2018-12-06 17:47
 **/
public class Test {
    public static void main(String[] args) {
        Director director=new Director(new ConCreateBuilder());
        Director director2=new Director(new BCreateBuilder());
        KFCPackage kfcPackage= director.getAPackAge();
        KFCPackage kfcPackage1=director2.getAPackAge();
        System.out.println(kfcPackage);
        System.out.println(kfcPackage1);
    }
}
