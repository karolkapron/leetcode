package ValidPalindrome;

import java.util.Arrays;
import java.util.Locale;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"

        ));
    }

    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[, . :]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

}
