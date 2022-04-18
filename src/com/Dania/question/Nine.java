package com.Dania.question;
//Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
public class Nine {
    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();

        for(int i=0; i< arr.length; i++){

            if(arr[i] - 'A' >=0 && 'Z' - arr[i] >=0){
                arr[i] = (char) (arr[i] - 'A' + 'a');
            }
        }

        return new String(arr);
    }



}
