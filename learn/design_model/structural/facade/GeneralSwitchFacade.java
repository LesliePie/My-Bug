package design_model.structural.facade;

/**
 * @program: MyStudy
 * @description: 电源总开关
 * @author: Leslie
 * @create: 2018-12-20 14:05
 **/
public class GeneralSwitchFacade {
    private Light[] lights=new Light[2];
    private Fan fan;
    private AirConditioner airConditioner;
    private Television television;

    public GeneralSwitchFacade() {
        this.lights[0] = new Light("客厅灯");
        this.lights[1] = new Light("卧室灯");
        this.fan = new Fan();
        this.airConditioner = new AirConditioner();
        this.television = new Television();
    }
    public void on(){
        this.airConditioner.on();
        this.fan.on();
        this.lights[0].on();
        this.lights[1].on();
        this.television.on();
    }

    public void off(){
        this.airConditioner.off();
        this.fan.off();
        this.lights[0].off();
        this.lights[1].off();
        this.television.off();
    }
}
