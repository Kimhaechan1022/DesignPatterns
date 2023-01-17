/*
 * 
 * Strategy pattern을 알아보자
 * (전략 패턴이라고도 함)
 * 
 *  전략 패턴은 상대적으로 가장 단순하다
 *  어떤 하나의 기능을 구성하는 특정 부분을 실행중 다른것으로 효과적으로 변경할수
 *  있는 방안을 제공한다. 즉, 필요할경우 전략을 바꿀수 있는 패턴
 * 
 * 
 *  어떤 하나의 기능을 수행하기 위해 1~n 까지의 단계가 순차적으로 실행되야하는데
 *  그중 특정 n-a의 단계부분이 조건에 따라 다르게 수행되거나 생략되거나 해야할경우 사용
 * 
 *  하나의 기능에 대하여 서로 다른 방식의 구현을 실행중에 변경할수 있음
 */


public class StrategyExam{
    public static void main(String[] args){
        
        SumPrinter cal = new SumPrinter();

        // 사용할 인터페이스 구현체만 골라주면 전략적으로 다르게 사용할수 있다.
        cal.print(new SimpleSumStrategy(), 10);
        cal.print(new GaussSumStrategy(), 10);
        
    }
}