package src.factoryMethod;

public class Shield implements Item{
    @Override
    public void use() {
        System.out.println("방패로 샥 막음");
    }
}
