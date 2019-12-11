package AbstractFactory;

//具体的产品  小米平板
public class MiPad extends PadIProduct {
    @Override
    public void call() {
        System.out.println("小米平板4 正在拨打电话");
    }
}
