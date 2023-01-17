package src.factoryMethod;

public abstract class Factory {
    public Item create(String name){
        // 해당 메소드 내의 하위메소드는 모두 추상메소드이다.
        boolean bCreatable = this.isCreatable(name);
        if(bCreatable){
            Item item = this.createItem(name);
            //객체 생성이후 후처리
            postprocessItem(name);
            return item;
        }
        return null;
    }

    public abstract boolean isCreatable(String name);
    public abstract Item createItem(String name);
    public abstract void postprocessItem(String name);


}
