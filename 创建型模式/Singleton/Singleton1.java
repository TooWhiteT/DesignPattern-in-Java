package Singleton;

public class Singleton1 implements Singleton{
    //饿汉 =》 恶汉
    //类创建时就同时创建好了静态对象供外部使用
    private static Singleton1 singleton = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance(){
        return singleton;
    }
    @Override
    public void Said() {
        System.out.println("我是饿汉 大恶汉！");
    }

    @Override
    public void Good() {
        System.out.println("线程安全 获取对象的速度快 ");
    }

    @Override
    public void Bad() {
        System.out.println("类加载较慢 不能确定有其他的方式（或者其他的静态方法）导致类装载");
    }

}
