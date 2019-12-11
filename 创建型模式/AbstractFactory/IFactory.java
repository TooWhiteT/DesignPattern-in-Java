package AbstractFactory;

//抽象工厂   生产具体产品的工厂
public abstract class IFactory {
    //生产平板的
    public abstract PadIProduct createPad();
    //生产手机的
    public abstract PhoneIProduct createPhone();
}
