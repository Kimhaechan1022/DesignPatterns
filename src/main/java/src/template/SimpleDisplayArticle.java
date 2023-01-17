import java.util.ArrayList;

public class SimpleDisplayArticle extends DisplayArticleTemplate{
    public SimpleDisplayArticle(Article article){
        super(article);
    }

    @Override
    protected void title() {
        System.out.println(article.getTitles());
    }

    @Override
    protected void content() {
        ArrayList<String> content = article.getContents();
        int cnt = content.size();
        for(int i=0; i<cnt; i++){
            System.out.println(content.get(i));
        }
    }

    @Override
    protected void footer() {
        System.out.println(article.getFooter());
        
    }

    
}
