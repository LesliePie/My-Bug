package design_model.structural.facade;

/**
 * @program: MyStudy
 * @description: 测试
 * @author: Leslie
 * @create: 2018-12-20 14:16
 **/
public class Test {
    public static void main(String[] args) {
        GeneralSwitchFacade switchFacade=new GeneralSwitchFacade();
        switchFacade.on();
        System.out.println("---------------------");
        switchFacade.off();
    }
}
