package src.mediator;

public interface Mediator {
    // 중재자에 참여하는 객체들은 자신의 상태가 변경되면 이 메소드를 호출해야함
    // 해당 메소드의 인자로 받은 객체로 메소드를 호출한다.
    void participantChanged(Participant participant);
}
