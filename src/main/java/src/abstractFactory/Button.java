package src.abstractFactory;

public abstract class Button {
    protected String caption;

    public Button(String caption) {
        this.caption = caption;
    }

    public void clickButton(){
        System.out.println(caption + "버튼이 클릭됨");
    }
    abstract void render();

}
