package design_model.structural.flyWeight;

/**
 * @program: MyStudy
 * @description:
 * @author: Leslie
 * @create: 2018-12-25 11:10
 **/
public class Test {
    public static void main(String[] args) {
        DeviceFactory df = new DeviceFactory();
        NetworkDevice nd1 = df.getNetworkDevice("cisco");
        nd1.use(new Port("1000"));
        NetworkDevice nd2 = df.getNetworkDevice("cisco");
        nd2.use(new Port("1001"));
        NetworkDevice nd3 = df.getNetworkDevice("cisco");
        nd3.use(new Port("1002"));
        NetworkDevice nd4 = df.getNetworkDevice("tp");
        nd4.use(new Port("1003"));
        NetworkDevice nd5 = df.getNetworkDevice("tp");
        nd5.use(new Port("1004"));
        System.out.println("Total Device:" + df.getTotalDevice());
        System.out.println("Total Terminal:" + df.getTotalTerminal());
        System.gc();
    }
}
