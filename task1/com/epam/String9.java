package hw.task1.com.epam;

public class String9 {
    public static void main(String[] args) {
        String text = "   I      have      a      lot   of   things   ";
//        System.out.println(text);

        String after = text.trim().replaceAll(" +", " ");

        System.out.println(after);
    }
}
