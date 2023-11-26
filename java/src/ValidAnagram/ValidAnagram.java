package ValidAnagram;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t){
        char[] sCh = s.toCharArray();
        char[] tCh = t.toCharArray();
        Arrays.sort(sCh);
        Arrays.sort(tCh);
        return Arrays.equals(sCh, tCh);
    }
}
