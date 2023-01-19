package src.abstractFactory;

public class WindowButton extends Button {
    public WindowButton(String caption) {
        super(caption);
    }

    @Override
    void render() {
        System.out.println(
                "window 랜더링 API를 이용해" +
                        this.caption + 
                        "버튼을 그립니당"
        );
    }

}
