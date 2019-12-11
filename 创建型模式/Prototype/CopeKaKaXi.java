package Prototype;

/**
 * 实现了Cloneable接口，它是一个标识接口，表示这个对象是可拷贝的，只要重写clone方法就可以实现拷贝。
 * 如果实现了Cloneable接口却没有重写clone方法就会报错。
 * 需要注意的是，clone方法不是在Cloneable接口中定义的（Cloneable接口中没有定义任何方法），而是在Object中定义的。
 */
public class CopeKaKaXi implements Cloneable {
    //拷贝忍者  卡卡西
    public CopeKaKaXi() {
        System.out.println("拷贝卡卡西 构造函数。。。");
    }
    //扩展深拷贝与浅拷贝
    private Participate participate = new Participate();
    public void setParticipate(String time, String address) {
        this.participate.setTime(time);
        this.participate.setAddress(address);
    }

    private String name;
    private String level;

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    protected CopeKaKaXi clone(){
        CopeKaKaXi kkx = null;
        try {
            kkx = (CopeKaKaXi) super.clone();
            //深拷贝 拷贝时 附带拷贝一下引用对象
            kkx.participate = this.participate.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return kkx;
    }

    public void freed() {
        System.out.println("忍术名：" + name + "\t忍术级别：" + level);
        System.out.println(participate.getAddress()+"\t参与时间："+participate.getTime());
    }
}
