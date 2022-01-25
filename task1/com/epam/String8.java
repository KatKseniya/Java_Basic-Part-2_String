package hw.task1.com.epam;

public class String8 {
    public static void main(String[] args) {
        String text = "Testing will nevere be done";
        String longWord = "";
        String[] words = text.split(" ");
        for(String word : words){
            if (word.length() > longWord.length()){
                longWord = word;
            }
            else if (word.length() == longWord.length()){
                continue;
            }
//            System.out.println(word);
        }
        System.out.println("Самое длинное слово: " + longWord);
    }
}
