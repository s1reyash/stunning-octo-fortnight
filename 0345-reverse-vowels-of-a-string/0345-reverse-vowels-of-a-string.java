class Solution {
    public String reverseVowels(String s) {
        char[]  word = s.toCharArray() ;
        String check = "aeiouAEIOU";
        int start = 0;
        int end = s.length() -1 ;

        while(start <end){
            //starting pointer to vovel
            while(start< end && check.indexOf(word[start]) == -1 ){
                start++;
            }

            //end pointer
            while(start< end && check.indexOf(word[end]) == -1 ){
                end--;
            }

            //swap
            char temp = word[start];
            word[start]= word[end];
            word[end]=temp;

            start++;
            end--;

        }

        String answer =new String (word);
        return answer ;
    }
}