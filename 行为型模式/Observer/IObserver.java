package Observer;

//抽象观察者  //观察者 主动发起观察的   比如狗仔
public interface IObserver {
    //发现绯闻  发布绯闻
    public void pubgossip(String title);//发出新闻标题
}
