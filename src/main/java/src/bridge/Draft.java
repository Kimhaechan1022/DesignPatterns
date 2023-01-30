package src.bridge;

public class Draft {
    
    private String titles;
    private String author;
    private String[] contents;

    public String getTitle(){return titles;}
    public String getAuthor(){return author;}
    public String[] getContent(){return contents;}

    public Draft(String title, String author, String[] content){
        this.titles = title;
        this.author = author;
        this.contents = content;
    }

    public void print(Display display){
        display.title(this);
        display.author(this);
        display.content(this);

    }

}
