package design_model.relationship.dependency;

/**
 * @program: oprate-AliYun
 * @description: 运动员
 * @author: Leslie
 * @create: 2018-12-04 10:10
 **/
public class Player {

    public void play(Football football){
        football.move();
    }
}
