package Observer;

//抽象主题  主题 被观察的   比如明星
public interface ISubject {
    //新增一名狗仔
    public void attach(IObserver observer);
    //减少一名狗仔
    public void detach(IObserver observer);
    //明星的绯闻
    public void gossip(String msg);
}
