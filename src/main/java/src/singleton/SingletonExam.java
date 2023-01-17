
/*
 * 하나의 클래스 타입에 대하여 오직 하나의 객체만 생성이 가능하도록 보장해주는 패턴
 * 싱글턴 클래스 객체에 접근은 가능하나 생성은 오직 하나만 가능하다.
 * new 를 이용한 객체 생성이 불가능하도록함
 * 인스턴스가 하나이기 때문에 생성 비용을 절감할수 있다.
 */

public class SingletonExam{
    public static void main(String[] args){
        // King king = new king(); 생성 안됨

        King king = King.getInstance();
        king.say();

        
        King king2 = King.getInstance();

        if(king.equals(king2)){
            System.out.println(true);
        }
    }
}