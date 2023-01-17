package src.decorator;
/*
    Decorator Pattern

    데코레이터는 장식하는 사람이란 뜻이다.
    기능을 마치 장식처럼 계속 추가할 수 있는 패턴이다.
    기능을 실행 중에 동적으로 변경 또는 확장 할 수 있는 패턴이다.

 */

import src.proxy.BufferDisplay;
import src.proxy.Display;
import src.proxy.ScreenDisplay;

public class DecoratorExam {
    public static void runDecoratorExam() {
        Strings strings = new Strings();

        strings.add("hello");
        strings.add("hello world");
        strings.add("hello im chimchakman");
        strings.add("hello");

        Item decorator = new SideDecorator(strings,'/');
        decorator = new LineNumberDecorator(decorator);
        decorator = new BoxDecorator(decorator);
        decorator.print();

    }
}
