package Singleton;

public class Singleton5_1 implements Singleton {
    //枚举单例另一种写法
    private Singleton5_1() {

    }
    private enum SingletonENUM{
        INSTANCE;
        private final Singleton5_1 singleton;

        SingletonENUM() {
            singleton = new Singleton5_1();
        }

        private Singleton5_1 getSingleton() {
            return singleton;
        }
    }
    public static Singleton5_1 getInstance() {
        return SingletonENUM.INSTANCE.getSingleton();
    }

    @Override
    public void Said() {
        System.out.println("我是枚举单例");
    }

    @Override
    public void Good() {
        System.out.println("我是不会被破坏的单例");
    }

    @Override
    public void Bad() {
        System.out.println("我。。。。太难了~ 不方便代码阅读");
    }
}
