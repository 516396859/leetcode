import java.util.HashMap;
import java.util.HashSet;

public class off006 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(target-numbers[i])){
                return new int[]{map.get(target-numbers[i]),i};
            }else {
                map.put(numbers[i],i);
            }
        }

        return numbers;
    }
}
