package GroupAnagrams;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String s = String.valueOf(str);
            if(map.get(s) != null){
                List<String> a = map.get(s);
                a.add(strs[i]);
                map.put(s, a);
            }else{
                List<String> a = new ArrayList<>();
                a.add(strs[i]);
                map.put(s, a);
            }
        }
        for(Map.Entry<String, List<String>> en:map.entrySet()){
            answer.add(en.getValue());
        }
        return answer;
    }
}
