package AbstractFactory;

//具体产品   华为平板
public class HWPad extends PadIProduct {
    @Override
    public void call() {
        System.out.println("华为平板MataPad pro 正在拨打电话");
    }
}
