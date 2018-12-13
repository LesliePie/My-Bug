package design_model.creational.builder_pattern;

/**
 * @program: MyStudy
 * @description: 具体建造者
 * @author: Leslie
 * @create: 2018-12-07 09:51
 **/
public class ConCreateBuilder extends Builder{



    @Override
    public void getColr() {
        Colr colr=new Colr();
        colr.setColor("黑色");
        colr.setName("百事");
        this.kfcPackage.setColr(colr);
    }

    @Override
    public void buildChips() {
        Chips chips=new Chips();
        chips.setSize("小份");
        kfcPackage.setChips(chips);
    }

    @Override
    public void buildHamburger() {
        Hamburger hamburger=new Hamburger();
        hamburger.setSize("大");
        hamburger.setTosate("鸡腿堡");
        kfcPackage.setHamburger(hamburger);
    }

}
