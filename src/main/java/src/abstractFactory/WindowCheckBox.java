package src.abstractFactory;

public class WindowCheckBox extends CheckBox{
    public WindowCheckBox(boolean bChecked) {
        super(bChecked);
    }

    @Override
    void render() {
        System.out.println("window 랜더링 API를 이용해"
                + (this.bChecked ? "체크인": "체크아웃")
                + " 체크 박스를 그립니다.");

    };

}
