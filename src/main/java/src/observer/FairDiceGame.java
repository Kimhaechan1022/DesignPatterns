package src.observer;

import java.util.Iterator;
import java.util.Random;

public class FairDiceGame extends DiceGame{
    private Random random = new Random();

    @Override
    public void play() {
        int diceNumber = random.nextInt() -1;
        System.out.println("dice rolling, " + diceNumber);
        Iterator<Player> iter = playerList.iterator();
        while(iter.hasNext()){
            iter.next().update(diceNumber);
        }

    }
}
