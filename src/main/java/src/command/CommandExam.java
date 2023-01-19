package src.command;

/**
 * 
 *  command Pattern
 *
 *  하나의 명령(기능)을 객체화 한 패턴
 *  객체는 전달할 수 있고 보관할 수 있음, 즉 명령(기능)을 전달 보관 가능하게 됨
 *  배치 실행, un do/ re do, 우선순위가 높은 명령을 먼저 실행하기 등이 가능해짐
 *  
 *  인터페이스를 어덯게 상속하여 구현하냐에 따라서 커맨드의 작동 방식이 달라지는 원리를 이용함
 *  그리고 실행시 커맨드 그룹내의 리스트를 이용해 해당 커맨드들을 한번에 실행한다.
 *
 *  각각 구현한 기능은 다르지만 업스케일 시에도 동일한 동작을 수행하는것을 볼수 있다.
 *
 *  !!!!!!!!!!!!!!!!!!!!!!!! 시도해 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 *  미디에이터 패턴에서 조건검사시 각각의 상속객체에서 구현한 조건식을 동일한 이름의 메소드명으로
 *  선언하고 임플리먼츠화 해서 이를 상속시킨 부모클래스로 조건식을 돌리면 일반화 시킬수 있을꺼 같음
 *  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */

public class CommandExam {

    public static void runCommandExam(){

        CommandGroup commandGroup = new CommandGroup();


        Command clearCmd = new ClearCommand();
        commandGroup.add(clearCmd);

        Command yellowCommand = new ColorCommand(ColorCommand.Color.YELLOW);
        commandGroup.add(yellowCommand);
        Command moveCommand = new MoveCommand(10, 1);
        commandGroup.add(moveCommand);

        Command printCommand = new PrintCommand("hello world!!");
        commandGroup.add(printCommand);
        Command moveCommand2 = new MoveCommand(15, 5);
        commandGroup.add(moveCommand2);

        commandGroup.add(printCommand);

        commandGroup.run();

    }
}
