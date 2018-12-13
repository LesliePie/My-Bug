/**
 * @program: oprate-AliYun
 * @description: threadtwo
 * @author: Leslie
 * @create: 2018-11-28 15:46
 **/
public class ThreadTwo extends Thread{
    private HeapTest test;

    public ThreadTwo(HeapTest name) {
        super();
        this.test = name;
    }

    @Override
    public void run() {
        System.out.println("线程2");
        this.test.name="线程2";
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
