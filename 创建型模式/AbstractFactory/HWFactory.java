package AbstractFactory;

//具体工厂  华为公司工厂
public class HWFactory extends IFactory {
    @Override
    public PadIProduct createPad() {//生产华为平板
        return new HWPad();
    }

    @Override
    public PhoneIProduct createPhone() {//生产华为手机
        return new HWPhone();
    }
}
