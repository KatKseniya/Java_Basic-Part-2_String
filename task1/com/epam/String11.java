package hw.task1.com.epam;


public class String11 {
    public static void main(String[] args) {
        String text = "I have a lot of things";
        int count = 0;
        String[] words = text.split(" ");
        for(String word : words){
            count++;
//            System.out.println(word);
        }

        System.out.println("The count of words is " + count);
    }

}
