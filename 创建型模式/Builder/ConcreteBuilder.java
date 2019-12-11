package Builder;

//工作人员来进行组装手机  工作人员要做的事情
public class ConcreteBuilder extends Builder {
    private Product product = new Product();//工作人员先拿出一个手机模具
    //工作人员 给手机模具安装cpu
    @Override
    public void builderCpu(String cpu) {
        product.setmCpu(cpu);
    }
    //工作人员 给手机模具安装内存组合
    @Override
    public void builderRam(String ram) {
        product.setmRam(ram);
    }
    //工作人员 给手机模具安装摄像组合
    @Override
    public void builderCamera(String camera) {
        product.setmCamera(camera);
    }
    //工作人员完成组装 向你丢出一部手机
    @Override
    public Product create() {
        return product;
    }
}
