import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.net.MalformedURLException;

public class Parse {
    public static void main(String[] args)  {
        while (true){
        int a=0 ;
        Parsing parsing = new Parsing();

        String[] finalArray = new String[0];
        try {
            finalArray = parsing.parsingHTML().text().replaceAll("\\W", " ").replaceAll("\\d","").split("\\s+");
        } catch (MalformedURLException e) {
            System.out.println("Неправильно введен адрес, проверьте написание адреса web-страницы");
        }catch (OutOfMemoryError e){
            System.out.println("Недостаточно памяти для скачивания HTML-страницы, попробуйте ввести другой адрес web-страницы");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, Integer> wordsMap = new HashMap<>();
        for(int j=0; j<finalArray.length; j++){
           String words = finalArray[j];
            for(int i=0; i<finalArray.length; i++ ) {
                if (words.equals(finalArray[i])) {
                    a = a+1;
                    wordsMap.put(words,a);
                }
            }
            a=0;
        }
        for (Map.Entry entry: wordsMap.entrySet()) {
            System.out.println(entry);
        }
    }
    }
}
