package design_model.relationship.interface_;

/**
 * @program: oprate-AliYun
 * @description: 人类
 * @author: Leslie
 * @create: 2018-12-04 10:53
 **/
public interface IPerson {
    /**
     * 人吃动物，依赖于动物关系（可能不严谨，暂且这样依赖）
     * @param iAnimal
     */
    void eat(IAnimal iAnimal);
}
