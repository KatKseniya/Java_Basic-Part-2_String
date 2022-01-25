package hw.task1.com.epam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2 {
    public static void main(String[] args) {
        String text = "*12test";
        String letter = Character.toString(text.charAt(0));

        String regex = "^[A-Za-z0-9_]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(letter);
        boolean found = matcher.matches();

        if(found)
            System.out.println("Введенное слово является идентификатором");
        else
            System.out.println("Введенное слово не является идентификатором");
    }
}

