package SimpleFactory;

//工厂 根据品牌 生产手机
public class Factory {
    public static IProduct createPhone(PhoneBrand brand){
        IProduct product = null;
        switch (brand) {
            case MIUI:
                product = new MiProduct();
                break;
            case HUAWEI:
                product = new HWProduct();
                break;
            case IPHONE:
                product = new ApProduct();
                break;
        }
        return product;
    }
}
