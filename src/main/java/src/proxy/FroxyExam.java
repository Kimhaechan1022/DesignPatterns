package src.proxy;
/*
    Froxy Pattern
    프록시의 뜻은 대리인이다.
    어떤 작업의 실행을 대리인을 통해 실행하도록 하는 패턴이다.

    결합도를 줄이면 기능 확장성이 좋아지고 유지보수 측면에서 좋기 떄문에
    협업측면에서도 이득이 있다.

    본예제 적용예 : 어떠한 작업에 수반되는 리소스가 많아 작업이 더디게 진행될떄
    버퍼에 모아 한방에 출력을 수행 하여 성능을 개선 시킴

    캐시 데이터 또는 객체를 운용하여 실제 작업을 수행하지 않고 기존 작업을 수행할때 사용하는 예제에서 잘 사용됨

    즉 실제기능을 수행하는 객체가 바쁠때 동일한 기능을 수행하는 대리자를 통해 해당 기능을 수행하는 방법이다.
    
    시나리오를 재정의 해아할꺼 같다 이거
    

 */

import src.observer.*;

public class FroxyExam {
    public static void runFroxyExam() {
        Display display = new ScreenDisplay();

        display.print("1");
        display.print("2");
        display.print("3");
        display.print("4");
//         느린 출력이 수행된다 이를 해결해기위해 모든 컨텐츠를 모아 한방에 출력하는 버퍼디스플레이를 만든다.

        Display display1 = new BufferDisplay(5);
        display1.print("1");
        display1.print("2");
        display1.print("3");
        display1.print("4");
        display1.print("5");
        display1.print("5");
        display1.print("5");
        display1.print("5");
        ((BufferDisplay) display1).flush();

    }
}
