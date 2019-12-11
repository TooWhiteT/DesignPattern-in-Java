package Singleton;

public class Singleton3 implements Singleton{
    //双重检查锁单例模式  DCL
    //懒汉模式中加锁的问题，对于getInstance()方法来说，绝大部分的操作都是读操作，读操作是线程安全的，所以我们没必让每个线程必须持有锁才能调用该方法，我们需要调整加锁

    //如果静态对象不加volatile  可能会在多线程中出现空指针异常 因为JVM的指令重排操作
    private volatile static Singleton3 singleton = null;
    private Singleton3() {
    }
    public static Singleton3 getInstance() {
        //// 第一次判断，如果这里为空，不进入抢锁阶段，直接返回实例   为了减少不必要的同步
        if (singleton == null) {
            synchronized (Singleton3.class){
                //// 抢到锁之后再次判断是否为空
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }

    @Override
    public void Said() {
        System.out.println("我是双重检查锁模式 解决了单例、性能、线程安全问题");
    }

    @Override
    public void Good() {
        System.out.println("资源利用率高,效率高");
    }

    @Override
    public void Bad() {
        System.out.println("第一次加载时反应稍慢一些，高并发下问题会概率出现DCL失效，所以有了静态内部类单例模式");
    }
}
