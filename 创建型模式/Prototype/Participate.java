package Prototype;

//参与事迹
public class Participate implements Cloneable{
    //实现深拷贝  引用对象也需实现Cloneable 接口重写clone方法
    private String time;
    private String address;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected Participate clone() {
        Participate participate = null;
        try {
            participate = (Participate) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return participate;
    }
}
