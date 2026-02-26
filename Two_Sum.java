import java.util.Map;
import java.util.HashMap;

public class Two_Sum {
    public static int[] TwoSum(int[] nums, int target){
        //create a hashmap to store the numbers and their indices
        Map<Integer,Integer> map = new HashMap<>();

        // iteterate through array
        for(int i=0;i<nums.length;i++){
            //calculate the complement of the current num
            int complement=target-nums[i];

            //check the complement is already present or not in map
            if(map.containsKey(complement)){
                // if found return indices of the complement and current num
                return new int[] {map.get(complement), i};
            }
            //otherwise add the current number and its index to map
            map.put(nums[i],i);
        }
        // return empty array if no solution found
        return new int[] {};
    }
	
// MAIN METHOD 
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = TwoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}