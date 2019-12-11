package Builder;

//工作人员的师傅  说你以后就照着我教的一步步就能组装出一部手机
public class Director {

    Builder builder = null;
    //师傅写一本说明书
    public Director(Builder builder) {
        this.builder = builder;
    }
    //师傅规定说明书中的具体步骤和规范
    public Product CreatePhone(String cpu, String ram, String camera) {
        this.builder.builderCpu(cpu);
        this.builder.builderRam(ram);
        this.builder.builderCamera(camera);
        return this.builder.create();
    }
}
