package Observer;

import java.util.ArrayList;
import java.util.List;

//具体主题   某某明星
public class Subject implements ISubject {
    //狗仔队列
    private List<IObserver> observerList = new ArrayList<IObserver>();

    private String name;
    public Subject(String name) {
        this.name = name;
    }
    //新增狗仔
    @Override
    public void attach(IObserver observer) {
        observerList.add(observer);
    }
    //流失狗仔
    @Override
    public void detach(IObserver observer) {
        observerList.remove(observer);
    }
    //发生绯闻
    @Override
    public void gossip(String msg) {
        for (IObserver gouzai : observerList) {
            gouzai.pubgossip(name+msg+"==>"+gouzai.toString());
        }
    }
}
