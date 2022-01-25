package hw.task1.com.epam;

public class String3 {
    public static void main(String[] args) {
        String text = "ф ы ф ы ф ы ф ";
        String text2 = text.replaceAll("\\s","");
//        System.out.println(text2);
        StringBuffer strBuffer = new StringBuffer(text2);
        strBuffer.reverse();
        System.out.println(strBuffer);

        if (strBuffer.toString().equals(text2)){
            System.out.println("Слово является перевертышем");
        }
        else {
            System.out.println("Слово не является перевертышем");
        }
    }
}
