package src.abstractFactory;

import src.facade.Facade;

/**
 * 
 *  추상화 단계가 낮은 구현단의 구현코드가 아직 정립되지 않을때 추상화수준을 높여
 *  범용적으로 사용가능한 객체를 생산하는 패턴으로
 *  
 *  먼저 만들어야할 컴포넌트들을 추상적으로 정하고 어떤 구체적인 상황이 주어지면
 *  각 컴포넌트들을 구체적으로 만드는 패턴
 *
 *  시나리오:
 *      개발자는 UI에 필요한 버튼과과 체크박스등의 객체를 정의해야한다. 다만 클라이언트 개발자들의
 *      플랫폼이 통합되지 않아( 윈도우, 리눅스 등) 구체화수준을 낮춘 객체를 명시해야한다.
 *      이때 추상 팩터리 클래스를 활용하여 해당 문제를 해결해 BOJA
 *
 *  최종 구현체 (해당 예제에선 윈도우버튼, 리눅스체크박스 등)이 구체화 조건에 맞는 추상클래스를
 *  상속받아 객체의 기능과 속성을 분기해서 구현이가능하다
 *  다만 상속과 구현 과정이 복잡하게 얽혀있기 때문에 클래스 다이어그램을 잘 이해할 필요가 있다.
 *
*
 */

public class AbstractFactoryExam {
    public static void runAbstractFactoryExam(){

        ComponentFactory factory = new WindowFactory();
        Button button = factory.createButton("확인");
        CheckBox checkBox = factory.createCheckBox(false);
        TextEdit textEdit = factory.createTextEdit("디자인패턴");

        ComponentFactory factory1 = new LinuxFactory();

        Button button1 = factory1.createButton("확인");
        CheckBox checkBox1 = factory1.createCheckBox(false);
        TextEdit textEdit1 = factory1.createTextEdit("디자인패턴");

        button.render();
        checkBox.render();
        textEdit.render();

        button1.render();
        checkBox1.render();
        textEdit1.render();

    }
}
