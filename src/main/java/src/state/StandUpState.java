package src.state;

public class StandUpState extends State{
    public StandUpState(Player player) {
        super(player);
    }

    @Override
    public void standUp() {
        player.talk("언제 움직여?");
    }

    @Override
    public void sitDown() {
        player.setState(new SitDownState(player));
        player.talk("앉으니 편함");
    }

    @Override
    public void walk() {
        player.setSpeed(5);
        player.setState(new WalkState(player));
        player.talk("걷는중");
    }

    @Override
    public void run() {
        player.setSpeed(10);
        player.setState(new RunState(player));
        player.talk("뛰어!");
    }

    @Override
    public String getDescription() {
        return "제자리에 서있음";
    }

}
