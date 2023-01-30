package src.strategy;

public class SumPrinter {
    void print(SumStrategy strategy, int N){
        System.out.printf("sum of 1 - %d : ", N);
        System.out.println(strategy.get(N));
    }
}
