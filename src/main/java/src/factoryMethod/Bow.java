package src.factoryMethod;

public class Bow implements Item{
    @Override
    public void use() {
        System.out.println("활을 샥 쏨");
    }
}
