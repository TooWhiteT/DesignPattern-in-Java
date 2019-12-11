package TemplateMethod;

public abstract class AbstractClass {
    //该方法为final，防止算法 模板框架被覆写
    public final void template() {
        dianhuo();
        start();
        go();
        if (isRed()) {
            System.out.println("当前是红灯");
            stop();
        }else {
            System.out.println("当前是绿灯");
        }
        hook();
    }
    //空实现方法
    protected void hook(){}
    protected abstract void start();
    protected abstract void stop();
    protected abstract void go();
    protected void dianhuo(){
        System.out.println("插入钥匙开启车辆");
    }
    //是否红灯
    protected boolean isRed(){
        return false;
    }
}
