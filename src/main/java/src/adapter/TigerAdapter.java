
package src.adapter;
public class TigerAdapter extends Animal{
    private Tiger tiger;
    public TigerAdapter(String name){
        super(name);

        tiger = new Tiger();
        tiger.setName(name);
    }
    // 기존 animal 클래스의 sound 메소드 스럽게 가공함
    @Override
    public void sound() {
        System.out.print(tiger.getName() + " ");
        tiger.roar();
    }
    
}
