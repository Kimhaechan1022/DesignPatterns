package src.iterator;

/*
 * iterator pattorn example
 * 
 * 
 *  동일한 형태의 데이터 집합 : Container or Aggregator
 *      ex: array, list, tree etc...
 * 
 *  각각의 aggregator에 따라 접근방법이 다르다. 이를 통일된 방법으로 구성 데이터를
 *  가저오게할수 있는 패턴이 Iterator 패턴이다.
 * 
 * 
 */

public class IteratorExam {
    public static void main(String[] args){
        Item[] items = {
            new Item("test1", 1),
            new Item("test2", 2),
            new Item("test3", 3)
        };
        Array array = new Array(items);
        Iterator it = array.iterator();

        while(it.next()){
            Item item = (Item)it.current();
            System.out.println(item);
        }

    }
}

