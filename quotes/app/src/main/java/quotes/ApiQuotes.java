package quotes;


public class ApiQuotes {
    private String quoteText;
    private String quoteAuthor;
    public ApiQuotes(String quoteText, String quoteAuthor) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
    }
    public String getQuoteText() {
        return quoteText;
    }
    public String getQuoteAuthor() {
        return quoteAuthor;
    }
    @Override
    public String toString() {
        return "ApiQuotes{" +
                "quoteText='" + quoteText + '\'' +
                ", quoteAuthor='" + quoteAuthor + '\'' +
                '}';
    }
    }