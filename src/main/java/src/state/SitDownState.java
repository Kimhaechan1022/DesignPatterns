package src.state;

public class SitDownState extends State{
    public SitDownState(Player player) {
        super(player);
    }

    @Override
    public void standUp() {
        player.setState(new StandUpState(player));
        player.talk("인나자..");
    }

    @Override
    public void sitDown() {
        player.talk("쥐나겠다.");
    }

    @Override
    public void walk() {
        player.talk("걸으려면 일단 일어나자");
        player.setState(new StandUpState(player));
    }

    @Override
    public void run() {
        player.talk("않아서 어떻게.. 일단 서자");
        player.setState(new StandUpState(player));
    }

    @Override
    public String getDescription() {
        return "앉아있음";
    }
}
