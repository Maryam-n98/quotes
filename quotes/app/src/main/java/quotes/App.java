/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\quotes\\quotes\\app\\src\\main\\java\\quotes\\recentquotes.json"));
        List<Quotes> quotes = new Gson().fromJson(reader, new TypeToken<List<Quotes>>(){}.getType());
        int min = 0;
        int max = quotes.size();
        try{
            URL url = new URL("http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            //con.connect();
            con.setRequestProperty("User-Agent", "Mozilla 5.0 (Windows; U; "
                    + "Windows NT 5.1; en-US; rv:1.8.0.11) ");
            con.connect();
            InputStreamReader input = new InputStreamReader(con.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(input);
            BufferedWriter add = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\quotes\\quotes\\app\\src\\main\\java\\quotes\\recentquotes.json" , false));
            ApiQuotes Api = gson.fromJson(bufferedReader, ApiQuotes.class);
            Quotes getQuote = new Quotes(null, Api.getAuthor(), null , Api.getText());
            System.out.println("From Api  "+getQuote);
            quotes.add(getQuote);
            gson = gson.newBuilder().setPrettyPrinting().create();
            add.write(gson.toJson(quotes));
            add.close();
            bufferedReader.close();
        }catch (Exception e){
            System.out.println(quotes.get((int)(Math.random()*(max-min+1)+min)));
        }
    }
}