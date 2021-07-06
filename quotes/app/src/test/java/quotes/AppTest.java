/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test
    public void contructorQuote (){
        Quotes quote = new Quotes(null,"Author","likes","text");
        Assertions.assertEquals(null, quote.getTags());
       Assertions.assertEquals("Author", quote.getAuthor());
        Assertions.assertEquals("likes", quote.getLikes());
        Assertions.assertEquals("text", quote.getText());
    }

    @Test
    public void jsonRenderTest() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/quotes/recentquotes.json"));
        assertNotNull(reader,"return true ");
    }
    @RepeatedTest(100)
    public void testFunctionality() throws IOException {
        Gson gson = new Gson();
        BufferedReader reader = new BufferedReader(new FileReader("./src/main/java/quotes/recentquotes.json"));
        List<Quotes> quotes = gson.fromJson(reader, new TypeToken<List<Quotes>>() {}.getType());
        int min =0;
        int max = 137;
        Quotes quote = quotes.get((int) (Math.random()*(max-min+1)+min));
        int index = 0;
        for (int i = 0; i < quotes.size() ; i++) {
            if(quotes.get(i).getText().equals(quote.getText())){
                index = i;
            }
        }
        Assertions.assertTrue(index >= 0 && index < 138 , "return true if got a random quote from the json file ");    }
}
