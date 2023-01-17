package src.proxy;

import java.util.ArrayList;

public class BufferDisplay implements Display{

    private ArrayList<String> buffer = new ArrayList<String>();
    private ScreenDisplay screen;
    private int bufferSize;

    public BufferDisplay(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    @Override
    public void print(String content) {
        buffer.add(content);
        if(buffer.size() == bufferSize){
            flush();
        }
    }
    public void flush(){
        if(screen == null) screen = new ScreenDisplay();
        String items = String.join("\n",buffer);
        screen.print(items);
        buffer.clear();
    }
}
