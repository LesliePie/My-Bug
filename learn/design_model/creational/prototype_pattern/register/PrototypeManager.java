package design_model.creational.prototype_pattern.register;

import java.util.Vector;

/**
 * @program: MyStudy
 * @description: 原型管理器
 * @author: Leslie
 * @create: 2018-12-13 16:53
 **/
public class PrototypeManager {

    private Vector vector=new Vector();

    /**
     * 增加新的对象
     * @param conCreatePrototype
     */
    public void add(ConCreatePrototype conCreatePrototype){
        vector.add(conCreatePrototype);
    }

    /**
     * 获取其中一个
     * @param i
     * @return
     */
    public ConCreatePrototype get(int i){
        return (ConCreatePrototype) vector.get(i);
    }

    /**
     * 获取数量
     * @return
     */
    public int getSize(){
        return vector.size();
    }
}
