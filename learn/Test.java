/**
 * @program: MyStudy
 * @description:
 * @author: Leslie
 * @create: 2019-02-15 10:19
 **/
public class Test {
    private static final Person PERSON=new Person();
    public static void main(String[] args) {
        System.out.println(PERSON.toString());
        PERSON.setName("张三");
        System.out.println(PERSON.getName());
    }
}
