import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Parsing {

   Document  parsingHTML() throws IOException {

                System.out.println("Введите адрес web-страницы в формате: https://...");
                Scanner str = new Scanner(System.in);
                String url = str.nextLine();
                Document doc = Jsoup.parse(new URL(url), 3000);return doc;
   }

}
