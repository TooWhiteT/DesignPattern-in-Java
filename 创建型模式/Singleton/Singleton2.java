package Singleton;

public class Singleton2 implements Singleton{
    //懒汉   使用时再实例静态对象供外部使用
    private static Singleton2 singleton = null;
    private static Singleton2 singleton2 = null;

    private Singleton2() { }//private 避免类在外部被实例化

    public static Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
    //同步锁 用于防止多次实例化
    public synchronized static Singleton2 getInstance2() {
        /**
         * 如果添加class类锁，影响了性能，加锁之后将代码进行了串行化，
         * 我们的代码块绝大部分是读操作，在读操作的情况下，代码线程是安全的
         */
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
        if (singleton != null) {
            System.out.println("在不加锁的情况下，线程不安全，可能出现多份实例");
        }
        if (singleton2 != null) {
            System.out.println("在加锁的情况下，会是程序串行化，使系统有严重的性能问题");
        }
    }
}
