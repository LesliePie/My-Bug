package design_model.creational.prototype_pattern.register;

/**
 * @program: MyStudy
 * @description: 客户
 * @author: Leslie
 * @create: 2018-12-13 16:56
 **/
public class RegisterTest {
    private PrototypeManager prototypeManager=new PrototypeManager();
    private ConCreatePrototype conCreatePrototype;
    public void register(){
        conCreatePrototype=new ConCreatePrototype();
        conCreatePrototype.setName("name");
        conCreatePrototype.setAge("18");
        ConCreatePrototype createPrototype= (ConCreatePrototype) conCreatePrototype.clone();
        prototypeManager.add(createPrototype);
    }

    public static void main(String[] args) {
        RegisterTest registerTest=new RegisterTest();
        registerTest.register();
        System.out.println(registerTest.prototypeManager.get(0));
    }
}
