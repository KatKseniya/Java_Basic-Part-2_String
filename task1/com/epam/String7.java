package hw.task1.com.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class String7 {
    public static void main(String[] args) throws IOException {

        Inpot input = new Inpot();
        List<String> arr = new ArrayList<String>();

        arr.add(input.Input());
        arr.add(input.Input());
        arr.add(input.Input());
        arr.add(input.Input());

        int largestString = arr.get(0).length();
        List<Integer> indexArr = new ArrayList<Integer>();
        int index = 0;

        for (int i = 0; i < arr.size(); i++) {
             if (arr.get(i).length() > largestString) {
                largestString = arr.get(i).length();
                index = i;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() == largestString) {
                indexArr.add(i);
            }
        }
            System.out.println("Индекс самой длинной строки: " + indexArr);
    }

    static class Inpot {
        public String Input() throws IOException {
            System.out.println("Введите строку");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String text = reader.readLine();
            return text;
        }
    }
}

