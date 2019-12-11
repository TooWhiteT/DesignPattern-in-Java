package AbstractFactory;

//具体产品  小米手机
public class MiPhone extends PhoneIProduct {
    @Override
    public void call() {
        System.out.println("小米手机 正在拨打电话");
    }
}
