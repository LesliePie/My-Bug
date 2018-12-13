package design_model.creational.builder_pattern;

/**
 * @program: MyStudy
 * @description: 抽象建造者类
 * @author: Leslie
 * @create: 2018-12-06 17:43
 **/
public abstract class Builder {

    protected KFCPackage kfcPackage=new KFCPackage();

    public abstract void getColr();
    public abstract void buildChips();
    public abstract void buildHamburger();

    public  KFCPackage getKfcPackage(){
        return kfcPackage;
    }
}
