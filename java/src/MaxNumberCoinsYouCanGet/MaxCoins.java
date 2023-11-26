package MaxNumberCoinsYouCanGet;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MaxCoins {

    public static void main(String[]args){
        System.out.println(maxCoins(new int[]{9,8,7,6,5,1,2,3,4}));
    }

    public static int maxCoins(int[] piles) {
        int answer = 0;
        Arrays.sort(piles);
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for(int num : piles){
            queue.add(num);
        }
        while(!queue.isEmpty()){
            queue.removeLast();
            answer += queue.removeLast();
            queue.removeFirst();
        }
        return answer;
    }
}
