package Builder;

public class Product {
    //产品    建造者模式 产品剖析主要还是看产品的成分
    //比如 一台主机  有cpu 主板  内存条  显卡  硬盘  电源等
    //再比如 辣条  由面粉 辣椒油  盐  防腐剂  等
    //再比如 手机 cpu 内存 电池 摄像头等
    private String mCpu;
    private String mRam;
    private String mCamera;

    public String getmCpu() {
        return mCpu;
    }

    public void setmCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public String getmRam() {
        return mRam;
    }

    public void setmRam(String mRam) {
        this.mRam = mRam;
    }

    public String getmCamera() {
        return mCamera;
    }

    public void setmCamera(String mCamera) {
        this.mCamera = mCamera;
    }
}
