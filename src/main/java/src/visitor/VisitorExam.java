package src.visitor;

/**
 *
 *  Visitor Pattern
 *
 *  데이터 구조와 데이터 처리를 분리해주는 패턴
 *
 *  데이터 처리 방식을 기존의 소스코드 변경 없이 새로운 클래스 추가만으로 확장가능
 *  데이터 구조는 Composite Pattern 을 사용해 표현함
 *
 *
 */

public class VisitorExam {
    public static void runVisitorExam(){

        ItemList list1 = new ItemList();
        list1.add(new Item(10));
        list1.add(new Item(20));
        list1.add(new Item(40));


        ItemList list2 = new ItemList();
        list2.add(new Item(30));
        list2.add(new Item(40));

        ItemList list3 = new ItemList();
        list3.add(new Item(25));
        list2.add(list3);

        SumVisitor sum = new SumVisitor();
        list1.accept(sum);
        System.out.println("sum = " + sum.getValue());

        AvgVisitor avg = new AvgVisitor();
        list1.accept(avg);
        System.out.println("avg = " + avg.getValue());


    }
}
