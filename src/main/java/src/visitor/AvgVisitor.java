package src.visitor;

public class AvgVisitor implements Visitor{
    private int sum=0;
    private int cnt=0;
    public double getValue(){
        return sum/cnt;
    }


    @Override
    public void visit(Unit unit) {
        if(unit instanceof Item){
            sum += ((Item)unit).getValue();
            cnt++;
        }else{
            unit.accept(this);
        }
    }
}
