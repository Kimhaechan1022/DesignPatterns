package src.decorator;

public class LineNumberDecorator extends Decorator{


    public LineNumberDecorator(Item item){
        super(item);
    }

    @Override
    public int getLineCount() {
        return item.getLineCount();
    }

    @Override
    public int getMaxLength() {
        return item.getMaxLength()+4;
    }

    @Override
    public int getLength(int index) {
        return item.getLength(index)+4;
    }

    @Override
    public String getString(int index) {
        return String.format("%02d", index)+ ": "+ item.getString(index);
    }
}
