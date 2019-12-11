package FactoryFunction;

//具体产品类  小米手机
public class MiProduct extends IProduct{
    //拨打电话
    @Override
    public void call() {
        System.out.println("小爱同学拨打电话");
    }
}
