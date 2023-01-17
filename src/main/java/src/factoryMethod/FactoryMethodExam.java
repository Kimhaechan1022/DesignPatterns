package src.factoryMethod;
/*

 Factory Method Pattern
 객체 생성을 위한 패턴
 객체 생성에 필요한 과정을 템플릿처럼 정해 놓고 각 과정을 다양하게 구현이 가능함
 구체적으로 생성할 클래스를 유연하게 정할 수 있음
 객체 생성에 대한 인터페이스와 구현의 분리
    (시스템의 확장성과 유지보수성을 높이는 효과를 도모함)

 생성을 관장하는 Factory 추상 클래스는 실제 구현과 관련된 구체적인 내용을 명세하지 않고 틀만 마련한다.
 이를 상속받아 구현한 ItemFactory 클래스가 구체적인 내용을 구현하는데 Item 인터페이스의 기능을 기반으로 구현을 수행한다.

 객체의 생성은 추상클래스에서, 객체의 구현은 인터페이스를 기반으로 한 자식 클래스에서 수행을 진행함으로 여러가지 구현에 방식들에 대한
 확장성을 보장받을수 있다. ItemFactory 와 비슷하게 FoodFactory 를 구현하고 Food의 기능을 인터페이스로 명시한다면 생성은 같은 클래스가
 수행하지만 생성된 결과 객체는 입맛에 따라 조율할수 있는 효과를 얻을수 있다.

 */
public class FactoryMethodExam {
    public static void runFactoryMethodExam() {
        Factory factory = new ItemFactory();
        Item item1 = factory.create("sword");
        if(item1!=null) item1.use();

        Item item2 = factory.create("sword");
        if(item2!=null) item2.use();
        Item item3 = factory.create("sword");
        if(item3!=null) item3.use();

        Item item4 = factory.create("sword");
        if(item4!=null) item4.use();

        Item item5 = factory.create("sword");
        if(item5!=null) item5.use();
    }
}
