package design_model.creational.builder_pattern;

/**
 * @program: MyStudy
 * @description: 肯德基套餐(不同种的可乐，薯条，汉堡)
 * @author: Leslie
 * @create: 2018-12-06 17:42
 **/
public class KFCPackage {
    private Chips chips;
    private Colr colr;
    private Hamburger hamburger;

    public Chips getChips() {
        return chips;
    }

    public void setChips(Chips chips) {
        this.chips = chips;
    }

    public Colr getColr() {
        return colr;
    }

    public void setColr(Colr colr) {
        this.colr = colr;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String toString() {
        return "KFCPackage{" +
                "chips=" + chips.toString() +
                ", colr=" + colr.toString() +
                ", hamburger=" + hamburger.toString() +
                '}';
    }
}
