// Title: Remove Outermost Parentheses
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-outermost-parentheses/


        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    ans.append(c);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    ans.append(c);
                }
            }
        }

        return ans.toString();
    }
}
