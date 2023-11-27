package ProductOfArrayExceptSelf;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int leftProd = 1;
        int rightProd = 1;

        for (int i = 0; i < nums.length; i++) {
            answer[i] = leftProd;
            leftProd *= nums[i];
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            answer[j] = answer[j] * rightProd;
            rightProd *= nums[j];
        }
        return answer;
    }
}
