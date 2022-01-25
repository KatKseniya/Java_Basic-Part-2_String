package hw.task1.com.epam;

import java.util.ArrayList;
import java.util.List;

public class String4 {
    public static void main(String[] args) {
        String text = "data 48 call 9 read13 blank0a";
        int count = 0;
        String[] words = text.split(" ");
        List<String> result = new ArrayList<String>();

        for(String word : words){
          String numberOnly= word.replaceAll("[^0-9]", "");
          if (!numberOnly.equals(""))
          result.add(numberOnly);
        }

        System.out.println(result);
    }
}
