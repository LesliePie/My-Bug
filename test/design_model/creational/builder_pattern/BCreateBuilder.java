package design_model.creational.builder_pattern;

/**
 * @program: MyStudy
 * @description: 另外一个具体建造者
 * @author: Leslie
 * @create: 2018-12-13 14:29
 **/
public class BCreateBuilder extends Builder{
    @Override
    public void getColr() {
        this.kfcPackage.setColr(new Colr());
    }

    @Override
    public void buildChips() {
        Chips chips=new Chips();
        chips.setSize("超大");
        this.kfcPackage.setChips(chips);
    }

    @Override
    public void buildHamburger() {
        Hamburger hamburger=new Hamburger();
        hamburger.setSize("超小");
        this.kfcPackage.setHamburger(hamburger);
    }
}
