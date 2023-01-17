
/*
 * Bridge Pattern
 * 
 * 기능 계층과 구현 계층의 분리로 시스템의 확장성과 유지보수성을 높이는 패턴
 * ( 기능계층 - 매서드 추가의 계층 / 구현계층 - 인터페이스의 구현 계층)
 * 기능계층과 구현계층을 연결해주는 패턴이 브릿지 패턴임
 * 
 * 
 * 
 */

public class BridgeExam{
    
    public static void main(String[] args){
        var title = "title1";
        var author = "author1";
        String[] content = {
            "content1",
            "content2",
            "content3"
        };

        Draft draft = new Draft(title, author, content);

        // 구현 계층에 해당하는 simple, caption display 인터페이스
        Display display1 = new SimpleDisplay();
        Display display2 = new CaptionDisplay();

        // 기능계층에 해당하는 print 메서드
        draft.print(display1);
        draft.print(display2);

        // 유지보수를 통한 새로운 기능이 필요한 아래와 같은 publication 기능계층 추가시
        var publisher = "publisher1";
        var cost = 100;

        Publication publication = new Publication(title,author, content,publisher,cost);

        // 구현계층의 두가지 display 스타일은 유지되고 기능계층의 수행되는 메소드는 추가된것 확인가능
        publication.print(display1);
        publication.print(display2);


    }
}