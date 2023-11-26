package LargestSubMatrix;

import java.util.Arrays;

public class LargestSubMatrix {
    public static void main(String[] args) {
        int[][] test = {{1,0,1,0}, {1,1,1,1}};
        System.out.println(largestSubmatrix(test));
    }

    public static int largestSubmatrix(int[][] matrix) {
        int[] len=new int[matrix[0].length];
        int res=0;
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == 0) len[j] = 0;
                else len[j]++;
            }
            int[] tmp = len.clone();
            Arrays.sort(tmp);
            for (int l = 1; l <= tmp.length; l++) {
                res = Math.max(res, l * tmp[tmp.length - l]);
            }
        }
        return res;
    }
}
