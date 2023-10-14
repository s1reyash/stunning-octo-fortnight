class Solution {
    public int maxVowels(String s, int k) {
        int maxVol = 0;
        int windowVol =0;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('u');
        vowels.add('o');
        vowels.add('i');
        vowels.add('e');

        //count the number of vowel in the first window
        for(int i=0; i<k;i++){
            if(vowels.contains(s.charAt(i)))
                windowVol++;

        maxVol= windowVol;
        }

        //sliding the window and update the maximum number of vowel

        for(int i=k;i<s.length();i++){
            if(vowels.contains(s.charAt(i-k)))
             windowVol--;
            if(vowels.contains(s.charAt(i)))
             windowVol++;


            maxVol = Math.max(maxVol, windowVol);
        }
        return maxVol;
        
    }
}