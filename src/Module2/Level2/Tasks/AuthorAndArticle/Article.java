package Module2.Level2.Tasks.AuthorAndArticle;

public class Article {
    private final String title;
    private final String text;
    private final Author author;

    public Article(String title, String text, Author author) {
        this.title = title;
        this.text = text;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public Author getAuthor() {
        return author;
    }
}
