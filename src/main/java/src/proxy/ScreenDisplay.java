package src.proxy;

public class ScreenDisplay implements Display{
    @Override
    public void print(String content) {
        try {
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(content);
    }
}
