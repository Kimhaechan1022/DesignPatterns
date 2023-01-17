package src.facade;

/**
 *
 *  Facade Pattern
 *  어떤 기능을 처리하기 위해 여러 객체들 사이의 복잡한 매서드 사용을 감춰서 단순화 시키는 패턴
 *
 *  그냥 함수 분기 같음... 뭐가 패턴인지는 모르겠다만 이거 더 알아봐야할듯
 *  걍 작업 자체를 블랙박스화해서 메소드 명만으로 사용할수 있도록 하는 패턴인가봄
 *
 */

public class FacadeExam {
    public static void runFacadeExam(){

        // 아래와 같이 구현하면 개발자가 dbms 니 캐시 니 메세지 니 알아야할게 너무 많다.

        DBMS dbms = new DBMS();
        Cache cache = new Cache();

        String name = "kim";

        Row row = cache.get(name);
        if(row == null){
            row = dbms.query(name);
            if(row !=null){
                cache.put(row);
            }
        }
        if(row != null){
            Message message = new Message(row);

            System.out.println(message.makeName());
            System.out.println(message.makeEmail());
            System.out.println(message.makeBirthday());
        }else{
            System.out.println(name + " is not exist.");
        }

        // 위의 일련의 작업들을 단순화 한게 facade 패턴이다.
        Facade facade = new Facade();
        facade.run("kim");

    }
}
