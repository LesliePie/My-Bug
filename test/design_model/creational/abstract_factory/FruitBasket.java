package design_model.creational.abstract_factory;

/**
 * @program: MyStudy
 * @description: 水果篮子
 * @author: Leslie
 * @create: 2018-12-06 15:41
 **/
public class FruitBasket {
    private IApple apple;
    private IBanana banana;

    public FruitBasket(FruitFactory fruitFactory) {
        this.apple=fruitFactory.getApple();
        this.banana=fruitFactory.getBanana();
    }

    public void getPresent(){
      System.out.println("收到礼物，香蕉");
        this.banana.name();
        this.banana.taste();
      System.out.println("收到苹果");
      this.apple.taste();
      this.apple.color();
    }
}
