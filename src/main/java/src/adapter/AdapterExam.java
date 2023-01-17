package src.adapter;


import java.util.ArrayList;

/*
 * Adapter Pattern
 * 
 * 어떤 클래스를 사용해야 하는데 이 클래스에 대한 코드를 변경할수 없는 상황에서도
 * 아답터 패턴을 적용하여 해당 클래스를 사용할수 있도록함
 * 
 * 추상글래스를 상속받아 구현한 아답터 클래스에 타겟 클래스의 객체를 필드값으로 갖게 하여 운용하는 방식
 * 
 * 내가 이해한 핵심 : 타겟 코드를 변경하는 것은 불가능하니 해당 코드의 객체를
 * 활용하여 변경하고 싶은 내용으로 바뀐것 처럼 중간에 아답터 패턴을 사용하는 것
 * 
 * 
 */

public class AdapterExam{

    public static void main(String[] args){
        
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("dog1"));
        animals.add(new Dog("dog2"));
        animals.add(new Cat("cat1"));

        // animals.add(new Tiger("tiger1"));  정상 동작 X
        
        animals.add(new TigerAdapter("tiger1"));

        animals.forEach(animal ->{
            animal.sound();
        });
    }
}