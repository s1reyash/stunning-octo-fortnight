class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int i = 0;
        int j = s.length()-1;

        while(i<=j){
            char currfirst = s.charAt(i);
            char currlast = s.charAt(j);
            if(!Character.isLetterOrDigit(currfirst)){
                i++;
            }else if(!Character.isLetterOrDigit(currlast)){
                j--;
            }else{
                if(Character.toLowerCase(currfirst) != Character.toLowerCase(currlast)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
        
    }
}