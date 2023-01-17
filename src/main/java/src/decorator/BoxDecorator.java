package src.decorator;

public class BoxDecorator extends Decorator{
    public BoxDecorator(Item item) {
        super(item);
    }

    @Override
    public int getLineCount() {
        return item.getLineCount()+2;
    }

    @Override
    public int getMaxLength() {
        return item.getMaxLength()+2;
    }

    @Override
    public int getLength(int index) {
        return item.getLength(index)+2;
    }

    @Override
    public String getString(int index) {
        int maxWidth = this.getMaxLength();
        if(index ==0 || index == getLineCount()-1){
            StringBuffer sb = new StringBuffer();
            sb.append("+");
            for(int i=0; i<maxWidth-2; i++){
                sb.append("-");
            }
            sb.append("+");
            return sb.toString();
        }
        else {
            return '|' + item.getString(index-1)
                    + makeTailString(maxWidth - getLength(index-1));
        }
    }
    public String makeTailString(int count){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<count;i++){
            sb.append(" ");
        }
        sb.append("|");
        return sb.toString();
    }
}
