package src.observer;

import java.util.LinkedList;

public abstract class DiceGame {
    // 자식 클래스에서도 playerList 필드값에 접근할수 있도록함
    protected LinkedList<Player> playerList = new LinkedList<Player>();

    public void addPlayer(Player player){
        playerList.add(player);
    }
    public abstract void play();
}
