package design_model.creational.abstract_factory;

/**
 * @program: MyStudy
 * @description: 整个农场
 * @author: Leslie
 * @create: 2018-12-06 14:19
 **/
public abstract  class FruitFactory {
    /**
     * 获取香蕉
     * @return
     */
   abstract IBanana getBanana();

    /**
     * 获取苹果
     * @return
     */
   abstract IApple getApple();
}
