package cc.openhome.jianting;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Classname OnlineUserCounter
 * @Description TODO
 * @Date 19-7-21 下午3:28
 * @Created by xns
 */
@WebListener
public class OnlineUserCounter implements HttpSessionListener {
    private static int counter;
    public static int getCounter(){
        return counter;
    }

    @Override
    public void sessionCreated(HttpSessionEvent se){
        OnlineUserCounter.counter++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se){
        OnlineUserCounter.counter--;
    }
}
