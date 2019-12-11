package Singleton;

public enum Singleton5 implements Singleton {
    INSTANCE;
    //枚举类单例
    // 枚举类实现单例模式是 effective java 作者极力推荐的单例实现模式，
    // 因为枚举类型是线程安全的，并且只会装载一次，
    // 设计者充分的利用了枚举的这个特性来实现单例模式，
    // 枚举的写法非常简单，而且枚举类型是所用单例实现中唯一一种不会被破坏的单例实现模式。
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
