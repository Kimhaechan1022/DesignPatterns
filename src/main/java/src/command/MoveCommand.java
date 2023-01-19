package src.command;

public class MoveCommand implements Command{
    private int x;
    private int y;

    public MoveCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        System.out.printf("%c[%d;%df",0x1B,y,x);
    }
}
