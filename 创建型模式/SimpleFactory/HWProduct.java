package SimpleFactory;

//具体产品  华为手机
public class HWProduct extends IProduct {
    @Override
    public void call() {
        System.out.println("小E 拨打电话");
    }
}
