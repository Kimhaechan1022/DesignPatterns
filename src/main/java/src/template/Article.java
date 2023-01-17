
import java.util.ArrayList;

public class Article {
    private String titles;
    private ArrayList<String> contents;
    private String footer;

    public Article(String titles, ArrayList<String> contents, String footer){
        this.titles = titles;
        this.contents = contents;
        this.footer = footer;
    }
    public String getTitles(){
        return titles;
    }
    
    public ArrayList<String> getContents(){
        return contents;
    }
    
    public String getFooter(){
        return footer;
    }

}
