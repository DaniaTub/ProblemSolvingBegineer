package com.Dania.question;

import java.util.Arrays;

//Write a function to find the longest common prefix string amongst an array of strings.
public class Four {
    public static void main(String args[]){



    }
    public String longestCommonPrefix(String[] strs) {
       if(strs.length ==0){
           return "";
       }
       if(strs.length==1){
           return strs[0];
       }
        Arrays.sort(strs); //to sort the lenght of the array of string
        int len = Math.min(strs[0].length(), strs[strs.length-1].length()); // take long and short
        int i = 0;
        while (i < len && strs[0].charAt(i) == strs[strs.length-1].charAt(i))
            i++;

        String pre = strs[0].substring(0, i);
        return pre;

    }

    }

