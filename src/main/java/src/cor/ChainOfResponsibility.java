package src.cor;
/*
       Chain Of Responsibility
       책임이란 무언가를 처리하는 기능(클래스)
       여러개의 책임들을 동적으로 연결해서 순차적으로 실행하는 패턴
       기능을 클래스 별로 분리하여 구현 하도록 유도하므로 클래스의 코드가 최적화됨
 */

import src.proxy.BufferDisplay;
import src.proxy.Display;
import src.proxy.ScreenDisplay;

public class ChainOfResponsibility {
    public static void runChainOfResponsibilityExam() {

        Handler handler1 = new ProtocolHandler();
        Handler handler2 = new PortHandler();
        Handler handler3 = new DomainHandler();

        handler1.setNext(handler2).setNext(handler3);

        String url = "http://www.naver.com:8080";
        System.out.println("INPUT : "+ url);

        handler1.run(url);
    }
}
