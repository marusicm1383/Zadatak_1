package com.example.solution;

public class Solution {
    public int solution(int n) {
        int r = 0;
        int t = 0;
        String S = Integer.toBinaryString(n);
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if (s == '1') {
                if (t > r) {
                    r = t;
                }
                t = 0;
            } else {
                t++;
            }
        }
        return r;
    }





    public static void main (String[] args) {
        Solution S = new Solution();
        System.out.println("r is :" +S.solution(9));
    }


}
