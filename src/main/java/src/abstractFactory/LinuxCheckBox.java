package src.abstractFactory;

public class LinuxCheckBox extends CheckBox{
    public LinuxCheckBox(boolean bChecked) {
        super(bChecked);
    }

    @Override
    void render() {
        System.out.println(
                "Linux 랜더링 API를 이용해"
                + (this.bChecked ? "체크인": "체크아웃")
                +" 체크박스를 그립니다."

        );
    }

}
