package src.composite;

/*
    Composite Pattern

    단일체와 집합체를 하나의 동일한 개념으로 처리하기 위한 패턴
    폴더와 파일을 동일한 개념으로 처리하기위해 유닛이라는 클래스를 상속받게 함
    DFS 방식의 탐색을 통해 집합체를 탐색하고 집합체 내의 단일체 내용을 기반으로 집합체를 단일체화 하는 방식을 수행한다.
    (집합체를 단일체처럼 다룰때는 같은 부모의 추상클래스를 상속받아 인터페이스를 맞추고 세부 구현은 각각 오버라이딩 하는 방식을 택한다.
    이떄 재귀 로직을 통해 DFS 를 수행하는 경우가 일반적이다.

 */
public class CompositeExam {
    public static void runCompositeExam(){
        Folder root = new Folder("root");
        root.add(new File("a.txt",1000));
        root.add(new File("b.txt",2000));

        Folder sub1 = new Folder("sub1");
        root.add(sub1);
        sub1.add(new File("sa.txt",100));
        sub1.add(new File("sb.txt",4000));

        Folder sub2 = new Folder("sub2");
        root.add(sub2);
        sub2.add(new File("SA.txt",250));
        sub2.add(new File("SB.txt",340));

        root.list();

    }
}
