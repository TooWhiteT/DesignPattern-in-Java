package TemplateMethod;

public class Buy extends AbstractClass {
    @Override
    protected void dianhuo() {
        super.dianhuo();
    }

    @Override
    protected void start() {
        System.out.println("公交车真正起步");
    }

    @Override
    protected void stop() {
        System.out.println("公交车停下了");
    }

    @Override
    protected void go() {
        System.out.println("公交车正在加速");
    }

    @Override
    protected boolean isRed() {
        return true;
    }

    @Override
    protected void hook() {
        System.out.println("油量低 警告！");
    }
}
