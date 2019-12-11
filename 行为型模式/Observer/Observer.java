package Observer;

//具体观察者
public class Observer implements IObserver{
    private String name;//狗仔昵称

    public Observer(String name) {
        this.name = name;
    }
    //狗仔发布绯闻
    @Override
    public void pubgossip(String title) {
        System.out.println("狗仔："+name+"\t八卦标题："+title);
    }
}
