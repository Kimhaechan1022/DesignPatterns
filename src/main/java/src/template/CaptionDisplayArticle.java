package src.template;

import java.util.ArrayList;

public class CaptionDisplayArticle extends DisplayArticleTemplate{
    public CaptionDisplayArticle(Article article){
        super(article);
    }

    @Override
    protected void title() {
        System.out.println("Title : " + article.getTitles());
    }

    @Override
    protected void content() {
        System.out.println("Content : ");
        ArrayList<String> content = article.getContents();
        int cnt = content.size();
        for(int i =0; i<cnt;i++){
            System.out.println("    " + content.get(i));
        }   
    }

    @Override
    protected void footer() {
        System.out.println("Footer : "+ article.getFooter());
    }
    
    
}
