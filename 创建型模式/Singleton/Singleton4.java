package Singleton;

public class Singleton4 implements Singleton{
    //静态内部类单例模式  又称单例持有者模式
    //实例由内部类创建，由于 JVM 在加载外部类的过程中, 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。
    //静态属性由static修饰，保证只被实例化一次，并且严格保证实例化顺序

    private static class SingletonHolder{
        private static final Singleton4 singleton = new Singleton4();
    }

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.singleton;
    }

    @Override
    public void Said() {
        System.out.println("我是静态内部类单例模式  又称单例持有者模式\n静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。");
    }

    @Override
    public void Good() {
        System.out.println("我肯定很优秀啦");
    }

    @Override
    public void Bad() {
        System.out.println("emmm。。。我在思考我有没有缺点");
    }
}
