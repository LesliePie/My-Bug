package design_model.creational.builder_pattern;

/**
 * @program: MyStudy
 * @description: 指挥者（导演类）
 * @author: Leslie
 * @create: 2018-12-06 17:45
 **/
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder=builder;
    }

    public  KFCPackage getAPackAge(){
        this.builder.buildChips();
        this.builder.getColr();
        this.builder.buildHamburger();
        return this.builder.getKfcPackage();
    }

}
