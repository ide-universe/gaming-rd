package com.faq;

import java.util.HashSet;
import java.util.Set;
public class LongestNonRepeatingCharacter {

    public static void main(String[] args) {

//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("abcabc"));
        System.out.println(lengthOfLongestSubstring("ab"));
        System.out.println(lengthOfLongestSubstring("abcadefgh"));

    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        if(s.length() == 0)
            return 0;

       //two pointer approach

        int left = 0;
        Set<Character> charSet = new HashSet<>();
        for(int right =0; right < s.length(); right++){

            while( charSet.contains(s.charAt(right))){

                charSet.remove(s.charAt(right));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }


        return maxLength;
    }



}
