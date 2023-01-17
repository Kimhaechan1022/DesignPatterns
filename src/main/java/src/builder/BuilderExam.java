package src.builder;

/**
 *
 *  Builder Pattern
 *
 *  생성자에서 this를 넘기며 계속 초기화하다가
 *  build 메소드를 통해 반환하는 패턴
 */

public class BuilderExam {

    public static void runBuilderExam(){
        Car car = new Car().builder()
                .name("쏘렌토")
                .speed(90)
                .type(CAR_TYPE.SUV)
                .build();
        System.out.println(car);
    }

}
