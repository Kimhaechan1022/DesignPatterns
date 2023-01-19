package src.abstractFactory;

public class WindowFactory extends ComponentFactory{

    @Override
    public Button createButton(String caption) {
        return new WindowButton(caption);
    }

    @Override
    public CheckBox createCheckBox(boolean bChecked) {
        return new WindowCheckBox(bChecked);
    }

    @Override
    public TextEdit createTextEdit(String value) {
        return new WindowTextEdit(value);
    }
}
