package src.interpreter;

/**
 *  Interpreter pattern
 *  문법에 맞춰 작성된 스크립트를 해석
 *  해석된 구문을 정해진 규칙대로 실핸하는 패턴
 *
 *  인터프리터 말 그대로 스크립트를 해석하여 기능을 수행하는 패턴으로 이해함
 *
 *  코드 짜는데 눈깔 빠질뻔.. 이해는 나중에 하자
 *  https://www.youtube.com/watch?v=RVZz_kLWdFM&list=PLe6NQuuFBu7FhPfxkjDd2cWnTy2y_w_jZ&index=24
 *
 *
 *
 */

public class InterpreterExam {
    public static void runInterpreterExam(){
        String script = "BEGIN FRONT LOOP 3 LOOP 2 RIGHT FRONT END LOOP 3 LEFT END BACK RIGHT END BACK END";

        System.out.println("script = " + script);

        Context context = new Context(script);
        Expression expression = new BeginExpression();

        if(expression.parse(context)){
            System.out.println(expression);
            expression.run();
        }

    }
}
