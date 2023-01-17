package src.observer;
/*

 Observer Pattern
 관찰자 클래스의 부모클래스를 추상적으로 선언하고 이를 상속받은 자식 관찰자들에 본인들이 기다리는 이벤트들을 서술한다.
 기다리는 이벤트들을 각각 다르게 구현해주면 해당 이벤트에 따른 각각의 다른 액션이 수행될수 있음으로
 이벤트를 발생시키는 곳에서 액션을 처리하는것이 아닌 이벤트를 받는 쪽에서 상황에 맞는 액션을 처리하는 확장성을 확보할수 있다.

 */

public class ObserverExam {
    public static void runObserverExam() {
//        DiceGame diceGame = new FairDiceGame();
        DiceGame diceGame = new UnFairDiceGame();
        Player player1 = new EvenBettingPlayer("player1");
        Player player2 = new OddBettingPlayer("player2");
        Player player3 = new OddBettingPlayer("player3");

        diceGame.addPlayer(player1);
        diceGame.addPlayer(player2);
        diceGame.addPlayer(player3);

        for(int i=0;i<5;i++){
            diceGame.play();
            System.out.println();
        }
    }
}
