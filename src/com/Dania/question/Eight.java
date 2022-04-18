package com.Dania.question;
//Given an integer n, return true if it is a power of three. Otherwise, return false.
public class Eight {
    public boolean isPowerOfThree(int n)
    {
        if (n==0)
        {
            return false;
        }
        while (n>0)
        {
            if (n % 3 == 0)
            {
                n = n / 3;
            }
        }
        return n == 1;
    }
}





