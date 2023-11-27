package LongestConsecutiveSequence;

import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
    public static int longestConsecutive(int[] nums) {
        int answer = 1;
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int j = 0; j < nums.length - 1; j++) {
           if (Math.abs(nums[j] - nums[j+1]) == 1){
               answer++;
           }else{
               ans.add(answer);
               answer = 0;
           }
        }
        Optional<Integer> maxValue = ans.stream().max(Comparator.naturalOrder());

        return maxValue.get();
    }
}
