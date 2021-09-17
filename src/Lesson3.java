import java.util.Arrays;
import java.util.Locale;

public class Lesson3 {

    public static void main(String[] args) {

        String str1 = "dcbasm345";
        String str2 = "3ms 4  CdAb 5";

        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        char[] chars = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars2);
        str1 = new String(chars);
        str2 = new String(chars2);
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

}
