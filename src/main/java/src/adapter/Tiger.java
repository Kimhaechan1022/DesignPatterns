
package src.adapter;
public class Tiger {

    //생성자가 아닌 setter를 활용
    private String name;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
    //sound() 메소드 대체
    void roar(){
        System.out.println("growl");
    }   
}
