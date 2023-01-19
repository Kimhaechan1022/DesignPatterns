package src.interpreter;

public class BeginExpression implements Expression{
    private CommandListExpression expression;

    @Override
    public boolean parse(Context context) {
        if(checkValidKeyword(context.getCurrentKeyword())){
            context.readNextKeyword();
            expression= new CommandListExpression();
            return expression.parse(context);
        }else{
            return false;
        }
    }

    private boolean checkValidKeyword(String currentKeyword) {
        return currentKeyword.equals("BEGIN");
    }

    @Override
    public boolean run() {
        return expression.run();
    }

    @Override
    public String toString() {
        return "BeginExpression{" +
                "expression=" + expression +
                '}';
    }
}
