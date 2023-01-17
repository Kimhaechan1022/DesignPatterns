package src.memento;

import java.util.Random;

/**
 * Memento Pattern
 *
 * memento는 추억 과거의 기억이란 뜻
 * 객체의 상태를 기억해 두었다가 필요할 때 기억해둔 상태로 되돌림
 * 객체의 상태에 대한 기억은 다른 객체에서도 읽기 전용으로 접근 가능함
 * 객체의 상태에 대한 기억에 대한 생성은 오직 해당 객체만 가능
 *
 * 해당 예제에서는 타겟 좌표까지 도달하기위해 동서남북 이동을 랜덤하게 수행한다.
 * 다만 이동 결과 거리가 이전보다 좁혀지지 않을경우 이전의 좌표 상태로 돌리는 모멘토 패턴 활용을 보인다.
 */

public class MementoExam {
    public static void runMementoExam(){
        Walker walker = new Walker(0,0,10,10);
        String[] actions = {"UP","RIGHT","DOWN","LEFT"};
        Random random = new Random();
        double minDistance = Double.MAX_VALUE;
        Walker.Memento memento = null;

        while(true){
            String action = actions[random.nextInt(4)];
            double distance = walker.walk(action);
            System.out.println(action + " "+ distance);
            if(distance == 0.0){
                break;
            }
            // 거리가 줄었으면 해당 모맨토를 반영
            if(minDistance > distance){
                minDistance = distance;
                memento = walker.createMemento();
            }else{  // 모멘토가 반영되지 않은 상태라면 이전 상태 (좌표로) 리스토어
                if(memento != null){
                    walker.restoreMemento(memento);
                    
                }
            }
        }
        System.out.println("walker's path: " +walker);
    }
}
