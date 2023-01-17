package src.observer;

import java.util.Iterator;
import java.util.Random;

public class UnFairDiceGame extends DiceGame{

    @Override
    public void play() {
        int diceNumber = 2;

        System.out.println("dice rolling, " + diceNumber);
        Iterator<Player> iter = playerList.iterator();
        while(iter.hasNext()){
            iter.next().update(diceNumber);
        }
    }
}
