package TemplateMethod;

public class Car extends AbstractClass {
    @Override
    protected void dianhuo() {
        super.dianhuo();
    }

    @Override
    protected void start() {
        System.out.println("小车起步");
    }

    @Override
    protected void stop() {
        System.out.println("小车停下");
    }

    @Override
    protected void go() {
        System.out.println("小车加速");
    }

    @Override
    protected boolean isRed() {
        return super.isRed();
    }

}
