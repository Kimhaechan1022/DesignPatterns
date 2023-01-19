package src.interpreter;

public interface Expression {
    boolean parse(Context context);
    boolean run();
}
