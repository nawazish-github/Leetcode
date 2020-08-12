package com.fishercoder.solutions;

public class _1217 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/play-with-chips/discuss/398239/C%2B%2B-3-lines
         */
        public int minCostToMoveChips(int[] chips) {
            int chipsAtOddPosition = 0;
            int chipsAtEvenPosition = 0;
            for (int i = 0; i < chips.length; i++) {
                if (chips[i] % 2 == 0) {
                    chipsAtEvenPosition++;
                } else {
                    chipsAtOddPosition++;
                }
            }
            return chipsAtEvenPosition > chipsAtOddPosition ? chipsAtOddPosition : chipsAtEvenPosition;
        }
    }
}
