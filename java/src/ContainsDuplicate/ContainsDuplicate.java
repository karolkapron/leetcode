package ContainsDuplicate;

import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i = nums.length - 1; i > 0; i--){
            int left = 0;
            int right = left+1;
            if(nums[left] == nums[right]){
                return true;
            }
        }
        return false;
    }
}
