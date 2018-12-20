package design_model.structural.facade;

/**
 * @program: MyStudy
 * @description: 灯
 * @author: Leslie
 * @create: 2018-12-20 14:07
 **/
public class Light {
    private String position;

    public Light(String position) {
        this.position = position;
    }

    public void on(){
        System.out.println(this.position+"的灯，启动");
    }
    public void off(){
        System.out.println(this.position+"的灯，关闭");
    }
}
