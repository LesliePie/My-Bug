/**
 * @program: oprate-AliYun
 * @description:
 * @author: Leslie
 * @create: 2018-11-28 15:42
 **/
public class ThreadOne extends Thread{
    private HeapTest test;

    public ThreadOne(HeapTest name) {
        super();
        this.test = name;
    }

    @Override
    public void run() {
        System.out.println("线程1");
        this.test.name="线程1";
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
