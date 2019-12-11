package FactoryFunction;

public class MainTest {
    //工厂方法模式
    /**
     * 定义一个用于创建对象的接口，让子类决定实例化哪个类。工厂方法使一个类的实例化延迟到其子类
     *
     * 简单工厂模式我们都知道，在工厂类中包含了必要的逻辑判断，根据不同的条件来动态实例化相关的类
     * 对客户端来说，去除了与具体产品的依赖，与此同时也会带来一个问题：如果我们去增加产品，比如我们要生产苹果电脑
     * 那我们就需要在工厂类中在添加一个Case分支条件，我们对修改开放了，这违背了开放封闭原则
     * 而工厂方法模式就没有违背这个开放封闭原则，如果我们需要生产苹果电脑，并不需要去修改工厂类，直接创建产品就好了
     *
     * 结构：
     * 1.IProduct：抽象产品类。
     * 2.Product: 具体产品类 实现抽象产品IProduct接口
     * 3.IFactory：抽象工厂类，该方法返回一个IProduct类型的对象。
     * 4.Factory：具体工厂类，返回Product实例。
     */
    public static void main(String[] args) {
        IFactory chinaFactory = new Factory();
        MiProduct miPhone = chinaFactory.createPhone(MiProduct.class);
        miPhone.call();
    }
}
