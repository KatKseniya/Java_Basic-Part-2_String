package hw.task1.com.epam;

import java.util.LinkedHashSet;
import java.util.Set;

public class String5 {
    public static void main(String[] args) {

        String text = new String("abc cde def");
        String input = text.trim().replaceAll(" +", "");
        System.out.println(input);

        char[] chars = input.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());
    }
}
