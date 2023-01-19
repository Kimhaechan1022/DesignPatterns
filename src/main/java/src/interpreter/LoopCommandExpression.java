package src.interpreter;

public class LoopCommandExpression extends CommandExpression{
    private int cnt;
    private CommandListExpression expression;

    public LoopCommandExpression(String keyword) {
        super(keyword);
    }


    @Override
    public boolean parse(Context context) {
        if(!checkValidKeyword(keyword)) return false;
        String countKeyword = context.readNextKeyword();
        if(countKeyword==null) return false;

        try {
            cnt = Integer.parseInt(countKeyword);
            expression = new CommandListExpression();
            if(context.readNextKeyword()==null){
                return false;
            }
            return expression.parse(context);
        }catch (Exception e){
            return false;
        }
    }

    public static boolean checkValidKeyword(String keyword){
        return keyword.equals("LOOP");
    }

    @Override
    public boolean run() {
        for (int i = 0; i <cnt ; i++) {
            if(!expression.run()){
                return false;
            }
        }
        return true;
    }
}
