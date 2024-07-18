package Module2.Level28.Tasks.AuthorAndArticle;

public class Author {
    private final String name;
    private final Article article;

    public Author(String name, String title, String text) {
        this.name = name;
        this.article = new Article();
    }

    public String getName() {
        return name;
    }

    public Article getArticle() {
        return article;
    }
}
