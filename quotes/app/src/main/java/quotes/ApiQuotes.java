package quotes;


public class ApiQuotes {
private final String author;
private final String text;


    public ApiQuotes(String author, String text) {
        this.author = author;
        this.text = text;

    }



    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "ApiQuotes{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
