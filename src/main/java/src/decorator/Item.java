package src.decorator;

public abstract class Item {
    public abstract int getLineCount();
    public abstract int getMaxLength();
    public abstract int getLength(int index);
    public abstract String getString(int index);

    public void print(){
        int cntLines = getLineCount();
        for(int i=0; i<cntLines ; i++){
            String string = getString(i);
            System.out.println(string);
        }
    }
}
