package SimpleFactory;

public class MainTest {
    //简单工厂模式
    /**
     * 简单工厂模式属于创建型模式又叫做静态工厂方法模式，是由一个工厂对象决定创建出哪一种产品类的实例
     *
     * 结构组成：
     * 1.Factory：工厂类，简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。
     * 2.IProduct：抽象产品类，简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口
     * 3.Product：具体产品类，是简单工厂模式的创建目标。
     *
     * 应用场景：
     * - 工厂类负责创建的对象比较少。
     * - 客户只知道传入工厂类的参数，对于如何创建对象（逻辑）不关心。
     *
     * 优点：
     * 使用户根据参数获得对应的类实例，避免了直接实例化类，降低了耦合性。
     * 缺点：
     * 可实例化的类型在编译期间已经被确定，如果增加新类型，则需要修改工厂，违背了开放封闭原则(ASD) 。
     * 简单工厂需要知道所有要生成的类型，当子类过多或者子类层次过多时不适合使用
     */
    public static void main(String[] args) {
        IProduct product = Factory.createPhone(PhoneBrand.IPHONE);
        System.out.println(PhoneBrand.getENUM(001)+"___"+PhoneBrand.getVal(PhoneBrand.HUAWEI));
        product.call();
    }
}
