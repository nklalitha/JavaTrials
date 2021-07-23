package com.example.laliTrials.problems;

/*

This question is asked by Amazon. Given a string representing your stones and another string representing a list of jewels, return the number of stones that you have that are also jewels.

Ex: Given the following jewels and stones...

jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0

 */
public class JewelsStones {
    public static void main(String[] args) {
        String jewels = "AYOPD";
        String stones = "ayopd";
        int count = 0;

        for (char ch : jewels.toCharArray()) {
            if (stones.indexOf(ch) != -1 ) {
                count ++;
                System.out.println("found it..");
            }
        }
        System.out.println("Answer - " + count);
    }
}
