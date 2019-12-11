package Singleton;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton6 implements Serializable {
    //破坏单例模式的方法
    //1. 实现序列化接口，可通过反序列化破坏单例
    //2. 反射  除了枚举，其他都能被反射破坏

    private static class SingletHolder{
        private final static Singleton6 singleton = new Singleton6();
    }

    private Singleton6() {
        //防反射机制破坏单例
        //反射是通过调用构造方法生成新的对象，所以如果我们想要阻止单例破坏，可以在构造方法中进行判断，若已有实例, 则阻止生成新的实例
        if (SingletHolder.singleton != null) {
            throw new RuntimeException("实例已经存在，请通过 getInstance()方法获取");
        }
    }

    public static Singleton6 getInstance() {
        return SingletHolder.singleton;
    }
    // 如果单例类实现了序列化接口Serializable,
    // 就可以通过反序列化破坏单例，所以我们可以不实现序列化接口,如果非得实现序列化接口，
    // 可以重写反序列化方法readResolve(), 反序列化时直接返回相关单例对象。
    private Object readResolve() throws ObjectStreamException {
        System.out.println("readResolve");
        return SingletHolder.singleton;
    }
    private Object writeReplace() throws ObjectStreamException {
        System.out.println("writeReplace");
        return SingletHolder.singleton;
    }
}
