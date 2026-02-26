
import java.util.HashSet;
class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums){
       // create hashset to store elements
       HashSet<Integer> seenNumbers = new HashSet<>();

       //iterate through each element
       for(int num:nums){
        if(seenNumbers.contains(num)){
            //if duplicate is present then return true
            return true;
        }
        seenNumbers.add(num);
       }
       // if no duplicate is found then return false
       return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
