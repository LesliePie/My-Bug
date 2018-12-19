package design_model.structural.decorative;

/**
 * @program: MyStudy
 * @description: 变形金刚变成机器人
 * @author: Leslie
 * @create: 2018-12-19 14:05
 **/
public class Robot extends Changer{

    public Robot(Transform transform) {
        super(transform);
        System.out.println("闪开，我要变机器人");
    }

    public void say(){
        System.out.println("我是一个会说话的机器人");
    }
}
