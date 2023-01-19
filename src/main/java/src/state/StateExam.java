package src.state;

import java.util.Scanner;

/**
 *  State pattern
 *  각 상태로 넘어가기위한 동작들을 정의하여 상태변경시 해당 동작을 수행한 이후에 상태를 변경함
 *  FSM 옛날에 구현한거랑 아주 비슷함, 넘어가기 위한 상태중 중간 상태가 필요하다면 상태를 중간으로 변경시키거나 막을수 있음
 *  각각의 상태로 넘어가기위한 메서드를 각 상태마다 다르게 구현하여 해당 로직을 완성할수있음
 *  이떄 모든 State 들이 부모로 취하는 객체는 모든 상태로 넘어갈수있는 추상 메소드들을 선언해두어야함
 *
 */

public class StateExam {
    public static void runStateExam(){

        Player player = new Player();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("플레이어 상태: " +
                    player.getState().getDescription()
                    +" /속도 : "+
                    player.getSpeed());
            System.out.println("1서기, 2앉기, 3걷기, 4뛰기, 다른 아무 문자");

            String in = sc.next();
            if(in.equals("1")) player.getState().standUp();
            else if(in.equals("2")) player.getState().sitDown();
            else if(in.equals("3")) player.getState().walk();
            else if(in.equals("4")) player.getState().run();
            else break;


        }
        sc.close();
    }
}
