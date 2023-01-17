package src.mediator;

/**
 * mediator은 중재자라는 뜻의 패턴이다.
 * 관계를 밀접하게 맺은 관계를 갖는 객체들을 중재하는 패턴
 * 복잡한 관계를 단순화 시키기 위해 중재자를 두고 각 객체들은 서로
 * 관계를 맺지않고 중재자와 관계를 맺는다.
 * 각 객체들은 중재자로 부터 상태 변경 통지를 받는다.
 * 해당 중재자를 통해 각 객체를 제어하게 된다, 복잡한 관계를 단순화 시키는데 사용목적이 있다.
 *
 */

public class MediatorExam  implements Mediator{
    public Door door = new Door(this);
    public Window window = new Window(this);
    public CoolAircon aircon = new CoolAircon(this);
    public HeatBoiler boiler = new HeatBoiler(this);

    public boolean isStatusChangedDoor(Participant participant){
        return participant == door && !door.isClosed();
    }

    @Override
    public void participantChanged(Participant participant) {
        // 상태가 변경된다면!
        // lambda

        if(participant == door && !door.isClosed()){
            aircon.off();
            boiler.off();
        }
        if(participant == window && !window.isClosed()){
            aircon.off();
            boiler.off();
        }
        if(participant == aircon && aircon.isRunning()){
            boiler.off();
            window.close();
            door.close();
        }
        if(participant == boiler && boiler.isRunning()){
            aircon.off();
            window.close();
            door.close();
        }
    }
    public void report(){
        System.out.println(door);
        System.out.println(window);
        System.out.println(aircon);
        System.out.println(boiler);
        System.out.println();

    }

    public static void runMediatorExam(){
        // 시나리오 : 스마트 홈
        MediatorExam mediatorExam = new MediatorExam();
        mediatorExam.report();
        mediatorExam.window.open();
        mediatorExam.report();
        mediatorExam.aircon.on();
        mediatorExam.report();
        mediatorExam.boiler.on();
        mediatorExam.report();

    }
}
