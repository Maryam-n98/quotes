package quotes;

import java.util.ArrayList;
import java.util.List;

public class ApiQuotes {
    List<String> text= new ArrayList<String>();

    public ApiQuotes(List<String> text) {
        this.text = text;
    }

    public List<String> getText() {
        return text;
    }

    @Override
    public String toString() {
        return "ApiQuotes{" +
                "text=" + text +
                '}';
    }
}
