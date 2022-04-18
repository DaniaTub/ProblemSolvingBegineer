package com.Dania.question;
//Given an integer n, return true if it is a power of four. Otherwise, return false.
public class Seven {

    public boolean isPowerOfFour(int n)
    {
        if (n<1) {
            return false;
        }
        while (n%4 == 0) {
            n = n/4;
        }
        return n == 1;
    }
}
