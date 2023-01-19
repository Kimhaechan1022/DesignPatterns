package src.state;

public class RunState extends State{

    public RunState(Player player) {
        super(player);
    }

    @Override
    public void standUp() {
        player.talk("뛰다가 갑자기 서면 무릅나가징");
        player.setSpeed(0);
        player.setState(new StandUpState(player));
    }

    @Override
    public void sitDown() {
        player.talk("뛰다가 앉으려고? 안되징");
        player.setSpeed(0);
        player.setState(new StandUpState(player));
    }

    @Override
    public void walk() {
        player.talk("걷자 이제");
        player.setSpeed(8);
        player.setState(new WalkState(player));
    }

    @Override
    public void run() {
        player.talk("더 빨리 뛰어보자");
        player.setSpeed(player.getSpeed()+2);
    }

    @Override
    public String getDescription() {
        return "뛰는중";
    }
}
