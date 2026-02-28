public class ValidAnagram {
    public boolean isAnagram(String s, String t){
        //check the length of both string if same then return true
        if(s.length() != t.length()){
            return false;
        }
        // initializing size of array of 26 alphabet
        int [] count= new int [26];

        //initialize string length
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;// 'r'-'a'=18-1=17 =17+1=18
            count[t.charAt(i)-'a']--;// 't'-'a'=20-1=19 =19-1=18
            //now both are same then it will cancel
        }
        //check for zero
        for(int c:count){
            if(c!=0){
                return false;
            }
        }   
        return true;
    }

    // main method
    public static void main(String[] args) {
        String s="rat";
        String t="tar";
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram(s,t));
    }
}   
