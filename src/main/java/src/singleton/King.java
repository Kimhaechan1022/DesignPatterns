public class King {

    // 생성자를 private 접근자로 캡슐화 하여 나 자신 이외에 어떠한 다른곳에서도 생성하지 못하도록 방지
    private King(){
    }
    // 오직 자기 자신만 필드에 접근할수 있도록 함 
    // 대신 클래스의 이름으로 접근하게 하기 위해 static으로 정적이게 선언
    private static King self = null;

    // 클래스 차원에서 위에 선언한 self 필드를 얻을수 있도록함
    // synch -> 멀티 스레드에서 여러개 생성을 불가능하도록 동기화 진행, 싱글 스레드라면 해당 선언 생략가능
    public synchronized static King getInstance(){
        // 만일 한번도 생성된적없다면 객체를 하나 생성함
        if(self == null){
            self = new King();
        }
        return self;

    }

    public void say(){
        System.out.println("I am one and only");
    }
}
