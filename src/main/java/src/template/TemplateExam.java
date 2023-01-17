import java.util.ArrayList;

/*
 * Template Pattern 
 * 
 * 어떤 기능에 대해 실행되어야 할 각 단계의 순서만 정의함
 * 각 단계에 대한 세부구현을 상황에 맞게 다르게 구현하게하는 패턴
 * (구체적인 구현 코드는 정의하지 않음)
 * 순서대로 실행만해줌(추상클래스)
 * 
 * 작업 진행에 추상적인 순서를 정의하고 해당 구현은 템플릿 추상클래스를 상속받은
 * 여러가지 스타일에 따라 다르게 지정하여 여러가지 스타일의 기능을 수행하도록하는 패턴
 * 
 */

public class TemplateExam{
    public static void main(String[] args){
        String title = "titleSample";
        ArrayList<String> content = new ArrayList<>();
        content.add("contentSample1");
        content.add("contentSample2");
        content.add("contentSample3");
        content.add("contentSample4");
        String footer = "footerSample";

        Article article = new Article(title, content, footer);

        DisplayArticleTemplate style1 = new SimpleDisplayArticle(article);
        DisplayArticleTemplate style2 = new CaptionDisplayArticle(article);

        style1.display();
        style2.display();
    }
}