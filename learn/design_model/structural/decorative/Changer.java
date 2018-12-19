package design_model.structural.decorative;

/**
 * @program: MyStudy
 * @description: 变形金刚
 * @author: Leslie
 * @create: 2018-12-19 14:04
 **/
public class Changer implements Transform{
    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        this.transform.move();
    }
}
