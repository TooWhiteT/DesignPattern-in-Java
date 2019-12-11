package AbstractFactory;

public class MainTest {
    //抽象工厂
    /**
     * 为创建一组相关或者相互依赖的对象提供一个接口，而无需指定它们的具体类
     *
     * 结构：
     * 1.IProduct 抽象产品
     * 2.Product  具体产品
     * 3.IFactory 抽象工厂
     * 4.Factory  具体工厂
     *
     * 优点：
     * 具体类的创建实例过程与客户端分离，客户端通过工厂的抽象接口操纵实例，客户端并不知道具体的实现是谁。
     * 缺点：
     * 如果增加新的产品 则也需要修改抽象工厂和所有的具体工厂。
     */
    public static void main(String[] args) {
        IFactory mi = new MiFactory();
        IFactory hw = new HWFactory();

        mi.createPad().call();
        hw.createPad().call();
        mi.createPhone().call();
        hw.createPhone().call();
    }
}
