package Prototype;

public class MainTest {
    //原型模式
    /**
     * 用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。
     * 原型模式的核心是 clone方法，通过该方法进行拷贝
     *
     * 结构
     * 1.Client：使用者
     * 2.IPrototype：抽象原型角色，抽象类或者接口，用来声明clone方法
     * 3.Prototype：具体的原型类，是客户端角色使用的对象，即被复制的对象。
     *
     * 需要注意的是，IPrototype通常是不用自己定义的，因为拷贝这个操作十分常用，
     * Java中就提供了Cloneable接口来支持拷贝操作，它就是原型模式中的IPrototype。
     * 当然，原型模式也未必非得去实现Cloneable接口，也有其他的实现方式。
     *
     * 使用场景：
     * 1.如果类的初始化需要耗费较多的资源，那么可以通过原型拷贝避免这些消耗
     * 2.通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式
     * 3.一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以拷贝多个对象供调用者使用，即保护性拷贝
     *
     * 优点：
     * 原型模式是在内存中二进制流的拷贝，要比new一个对象的性能要好，特别是需要产生大量对象时
     *
     * 缺点：
     * 直接在内存中拷贝，构造函数是不会执行的，这样就减少了约束，这既是优点也是缺点，需要在实际应用中去考量
     *
     * 扩展点：深拷贝与浅拷贝
     *
     * 因为Object类提供的clone方法，不会拷贝对象中的内部数组和引用对象，导致它们仍旧指向原来对象的内部元素地址，这种拷贝叫做浅拷贝。
     *
     * 拷贝对象的同时，也将它内部的引用对象进行拷贝，使得每个拷贝的对象之间无任何关联，都指向了自身对应的引用对象，这种拷贝就是深拷贝。
     */
    public static void main(String[] args) {
        //客户端调用
        CopeKaKaXi rz = new CopeKaKaXi();
        rz.setLevel("S级");
        rz.setName("神威");
        rz.setParticipate("12岁","成为上忍进入暗部");//发现事迹不好写  emmm例子不知道举什么
        CopeKaKaXi a = rz.clone();
        a.setLevel("A级");
        a.setName("影分身");
        a.setParticipate("九尾大乱木叶村","保护玖辛奈");//浅拷贝 引用类型拷贝后会存储最后一次拷贝的值
        CopeKaKaXi b = rz.clone();
        b.setLevel("S级");
        b.setName("雷切");
        b.setParticipate("忍界大战","与带土一战");

        rz.freed();
        a.freed();
        b.freed();
    }
}
