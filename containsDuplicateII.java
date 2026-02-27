import java.util.HashSet;
import java.util.Set;
class containsDuplicateII {
    public boolean containduplicate(int[] nums,int k){
        // edge case
        if(k<=0) return false;
        // creating hashset
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            // checking duplicate
            if (set.contains(nums[i])){
                //if duplicate is present then return true
                return true;
            }
            // add element to the window
            set.add(nums[i]);
            //maintaining sliding window
            if(i>=k){
                set.remove(nums[i-k]);
            }

        }
        // if no duplicate is present then return false
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,1};
        int k=3;
        containsDuplicateII obj = new containsDuplicateII();
        System.out.println(obj.containduplicate(nums, k));
    }
    
}
