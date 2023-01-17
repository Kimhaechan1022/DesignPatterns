package src.prototype;

import src.proxy.BufferDisplay;
import src.proxy.Display;
import src.proxy.ScreenDisplay;
/*
    Prototype Pattern

    실행중에 생성된 객체로 다른 객체를 생성하는 패턴
    프로토 타입으로 만든 객체의 상태를 변경해도 원본 객체의 상태는 변경되지 않음
    딥카피와 같다.

    일반적으로 클래스를 사용해서 생성하지만, new class 와 같이
    프로토 타입은 이미 생성된 객체를 통해 독립된 또하나의 객체를 만든다.

    객체로 부터 또다른 객체를 생성하는 내부로직을 갖고있다.

    프로토 타입 인터페이스를 상송받은 모든 클래스들은 copy 메소들를 구현한다.
    해당 메소드는 본인타입의 새 객체를 입력받은 파라미터로 초기화하여 return 한다.
    이게 핵심이다.

    copy 메소드로 반환받은 객체는 동일한 내용으로 생성되었지만 new 를 이용해 새롭게 만들어진 객체들이므로 원본 객체에 영향이 가지 않는다.


 */



public class PrototypeExam {
    public static void runPrototypeExam() {
        Point pt1 = new Point();
        pt1.setX(0);
        pt1.setY(0);
        System.out.println(pt1.draw());

        Point pt2 = new Point();
        pt2.setX(100);
        pt2.setY(0);
        System.out.println(pt2.draw());

        Line line1 = new Line();
        line1.setStartPt(pt1);
        line1.setEndPt(pt2);
        System.out.println(line1.draw());

        Line lineCopy = (Line) line1.copy();





        Point pt3 = new Point();
        pt3.setX(100);
        pt3.setY(100);
        System.out.println(pt3.draw());

        Point pt4 = new Point();
        pt4.setX(0);
        pt4.setY(100);
        System.out.println(pt4.draw());


        Line line2 = new Line();
        line2.setStartPt(pt2);
        line2.setEndPt(pt3);

        Line line3 = new Line();
        line3.setStartPt(pt3);
        line3.setEndPt(pt4);

        Line line4 = new Line();
        line4.setStartPt(pt4);
        line4.setEndPt(pt1);


        Group rect = new Group("RECT");
        rect.addShape(line1).addShape(line2).addShape(line3).addShape(line4);

        System.out.println(rect.draw());

        Group cloneRect = (Group) rect.copy();
        cloneRect.moveOffset(100,100);


        System.out.println(cloneRect.draw());
        System.out.println(rect.draw());
    }
}
