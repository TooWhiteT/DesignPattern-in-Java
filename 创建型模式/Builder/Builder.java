package Builder;

//一个抽象的 组装者  有抽象的几个能力   组装说明书
public abstract class Builder {
    //给手机安装cpu
    public abstract void builderCpu(String cpu);
    //给手机安装内存
    public abstract void builderRam(String ram);
    //给手机安装摄像头
    public abstract void builderCamera(String camera);
    //创造一部手机的create 方法
    public abstract Product create();
}
