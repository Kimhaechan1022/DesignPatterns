package src.flyweight;
/*
 * Flyweight Pattern
 * 
 * 사용 목적
 * 어떤 객체를 사용하기 위해 매번 생성하지 않고 한번만 생성하고 다시 필요해
 * 질때 이전에 생성된 객체를 재사용하기 위함
 * 
 * 객체를 생성할 때 많은 자원을 소모될 경우 플라이웨이트 패턴을 적용하여
 * 훨씬 적은 자원만으로 필요 객체를 재사용할수 있음
 * 
 * 따라서 객체의 무게 자체는 무거운 녀석을 가볍게 계속 재활용하기 위해 씀
 * 
 * 
 * 따라하긴 해봤는데 이해 못함 다시 찬찬히 봐야 할거 같음!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */

public class FlyweightExam{
    public static void main(String[] args){
        Number number = new Number(123123);

        
        System.out.println();
        System.out.println();

        number.print(5, 5);

        System.out.println();
        System.out.println();
        System.out.println();
    }
}