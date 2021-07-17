package quotes;


public class ApiQuotes {
    private String text;
    private String Author;

    public ApiQuotes(String text, String author) {
        this.text = text;
        Author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
