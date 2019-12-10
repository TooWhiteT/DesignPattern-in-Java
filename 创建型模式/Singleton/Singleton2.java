package Singleton;

public class Singleton2 implements Singleton{
    //懒汉   使用时再实例静态对象供外部使用
    private static Singleton2 singleton = null;
    private static volatile Singleton2 singleton2 = null;

    private Singleton2() { }//private 避免类在外部被实例化

    public static Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }

    public static synchronized Singleton2 getInstance2() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    @Override
    public void Said() {
        if (singleton != null) {
            System.out.println("我是懒汉  线程不安全的写法");
        }
        if (singleton2 != null) {
            System.out.println("我是懒汉  线程安全的写法");
        }
    }

    @Override
    public void Good() {
        System.out.println("节约资源");
    }

    @Override
    public void Bad() {
        System.out.println("emmm。。。 还没想到");
    }
}
