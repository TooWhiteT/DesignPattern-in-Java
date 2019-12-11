package SimpleFactory;

//具体产品   苹果手机
public class ApProduct extends IProduct {
    @Override
    public void call() {
        System.out.println("siri 拨打电话");
    }
}
