// Title: Stone Game IX
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/stone-game-ix/

        int count2 = 0;

        for (int num : stones) {
            if (num % 3 == 0) {
                count0++;
            } else if (num % 3 == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        if (count0 % 2 == 0) {
            return count1 > 0 && count2 > 0;
        }

        return Math.abs(count1 - count2) > 2;
    }
}
