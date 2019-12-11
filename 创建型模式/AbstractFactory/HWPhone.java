package AbstractFactory;

//具体产品  华为手机
public class HWPhone extends PhoneIProduct {
    @Override
    public void call() {
        System.out.println("华为手机 正在拨打电话");
    }
}
