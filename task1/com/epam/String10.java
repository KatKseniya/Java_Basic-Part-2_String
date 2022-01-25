package hw.task1.com.epam;

public class String10 {
    public static void main(String[] args) {
        String text = "I have a Lot of Things";
        int upperCase = 0;
        int lowerCase = 0;
        char[] text1 = text.toCharArray();

        for (int i = 0; i < text1.length; i++) {
            if (text1[i] >= 'a' && text1[i] <= 'z' || text1[i] >= 'A' && text1[i] <= 'Z') {
                if (Character.isUpperCase(text1[i])) {
                    upperCase++;
                }
                if (Character.isLowerCase(text1[i])) {
                    lowerCase++;
                }
            }

        }
//        System.out.println(text.length());
        System.out.println("Count of upperCase = " + upperCase);
        System.out.println("Count of lowerCase = " + lowerCase);
    }
}
