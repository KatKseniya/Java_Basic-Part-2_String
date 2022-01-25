package hw.task1.com.epam;

public class String6 {
    public static void main(String[] args) {
        String str = "Привет текст для тестирования!";
        String searchWord = "текст для";
        String needWord = "text for";
        String result = "";

        if (str.contains(searchWord)) {
            result = str.replace(searchWord, needWord);
        }
        System.out.println(result);
    }

}
