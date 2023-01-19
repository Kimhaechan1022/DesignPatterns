package src.state;

public class WalkState extends State{
    public WalkState(Player player) {
        super(player);
    }

    @Override
    public void standUp() {
        player.setSpeed(0);
        player.talk("멈추엉");
        player.setState(new StandUpState(player));
    }

    @Override
    public void sitDown() {
        player.setSpeed(0);
        player.talk("걷다 앉으면 기모띠");
        player.setState(new SitDownState(player));
    }

    @Override
    public void walk() {
        player.talk("난 걷는중이지용");
    }

    @Override
    public void run() {
        player.setSpeed(20);
        player.talk("걷다가 뛰면 더빠르지");
        player.setState(new RunState(player));
    }

    @Override
    public String getDescription() {
        return "걷는중";
    }
}
