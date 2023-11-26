package TopKElements;

import java.util.*;

public class TopKElements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        List<Integer> test = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) != null){
                counter = map.get(nums[i]) + 1;
                map.put(nums[i], counter);

            }else{
                map.put(nums[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        List<Map.Entry<Integer, Integer>> topK = list.subList(0, k);
        for (Map.Entry<Integer, Integer> entry : topK) {
            test.add(entry.getKey());
        }
        for (int j = 0; j < test.size(); j++){
            answer[j] = test.get(j);
        }
        return answer;
    }
}
