package AbstractFactory;

//具体工厂  小米公司工厂
public class MiFactory extends IFactory {
    @Override
    public PadIProduct createPad() {//生产小米平板
        return new MiPad();
    }

    @Override
    public PhoneIProduct createPhone() {//生产小米手机
        return new MiPhone();
    }
}
