package task_6.game;

import javax.ejb.Singleton;
import java.util.Random;

@Singleton
public class GameBean {

    private int num = 0;

    public GameBean() {
        newNum();
    }

    public void newNum(){
        num = new Random().nextInt(9)+1;
    }
    public int getNum(){
        return num;
    }
}
