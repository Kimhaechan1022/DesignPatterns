public abstract class DisplayArticleTemplate {
    protected Article article;

    public DisplayArticleTemplate(Article article){
        this.article = article;
    }
    // 파생클래스에서 해당 메소드를 변경할수 없도록 강제하기 위해 final을 사용
    public final void display(){
        title();
        content();
        footer();
    }

    protected abstract void title();
    protected abstract void content();
    protected abstract void footer();

}

