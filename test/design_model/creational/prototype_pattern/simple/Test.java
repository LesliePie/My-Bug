package design_model.creational.prototype_pattern.simple;

/**
 * @program: MyStudy
 * @description:
 * @author: Leslie
 * @create: 2018-12-13 16:22
 **/
public class Test {
    public static void main(String[] args) {
        Email email=new Email();
        email.setName("名字");
        email.setText("主题");
        Other other=new Other();
        other.setName("对象1");
        email.setOther(other);
        //浅克隆
        Email emailCopy= (Email) email.clone();
        //深克隆
        Email deepCopy= (Email) email.deepClone();
        System.out.println("email:"+email);
        System.out.println("copy"+emailCopy);
        System.out.println("deep"+deepCopy);
        //为true 浅copy
        System.out.println(other==emailCopy.getOther());
        //false other已经变成了另外的对象
        System.out.println(other==deepCopy.getOther());
    }
}
