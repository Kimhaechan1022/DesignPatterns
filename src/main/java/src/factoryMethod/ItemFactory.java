package src.factoryMethod;

import java.util.HashMap;

public class ItemFactory extends Factory{
    @Override
    public boolean isCreatable(String name) {
        ItemData itemData = repository.get(name);
        if(itemData == null){
            System.out.println(name + "은 알 수 없는 아이템");
            return false;
        }
        if(itemData.currentCnt >= itemData.maxCnt){
            System.out.println("품절 아이템");
            return false;
        }
        return true;
    }

    @Override
    public Item createItem(String name) {
        Item item = null;
        if(name == "sword") item = new Sword();
        if(name == "shield") item = new Shield();
        if(name == "bow") item = new Bow();
        return item;
    }

    @Override
    public void postprocessItem(String name) {
        ItemData itemData = repository.get(name);
        if(itemData != null) itemData.currentCnt++;

    }

    private class ItemData{
        int maxCnt;
        int currentCnt;
        ItemData(int maxCnt){
            this.maxCnt = maxCnt;
        }
    }

    private HashMap<String,ItemData> repository;

    public ItemFactory(){
        repository = new HashMap<String,ItemData>();
        repository.put("sword", new ItemData(3));
        repository.put("shield", new ItemData(2));
        repository.put("bow", new ItemData(1));
    }

}
