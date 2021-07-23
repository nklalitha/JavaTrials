package com.example.laliTrials.problems;

public class Binary {
    public static void main(String[] args) { // 100 + 1 = 101 //11 + 1 =100 // 1 + 0 = 1
        String first = "100";
        String second = "1";
        int i = first.length() - 1;
        int j = second.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >=0 || j >= 0) {
            int sum = carry;
            if (i >=0) sum += first.charAt(i) - '0'; // - 0 to make it an int
            if (j >=0) sum += second.charAt(j) - '0';
            result.append(sum % 2);
            carry = sum /2;
            i --;
            j --;
        }
        if (carry > 0) {
            result.append(carry);
        }
        System.out.println("Result ---- " + result.reverse().toString());

    }
}
