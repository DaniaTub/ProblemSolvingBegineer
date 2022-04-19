package com.Dania.question;
//You're given strings jewels representing the types of stones that are jewels,
// and stones representing the stones you have.
// Each character in stones is a type of stone you have.
// You want to know how many of the stones you have are also jewels.
public class Eleven {
    public int numJewelsInStones(String jewels, String stones) {


            int count = 0;
            char[] arrone = jewels.toCharArray();
            char[] arrtwo = stones.toCharArray();

            for (int i = 0; i < arrone.length; ) {
                for (int j = 0; j < arrtwo.length; j++) {
                    if (arrone[i] == arrtwo[j]) {
                        count++;

                    }

                }
                i++;

            }
            return count;

        }
    }






