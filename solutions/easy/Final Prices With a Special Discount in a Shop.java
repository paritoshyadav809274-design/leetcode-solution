// Title: Final Prices With a Special Discount in a Shop
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/

        int n = prices.length;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() > prices[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = prices[i];
            } else {
                ans[i] = prices[i] - st.peek();
            }

            st.push(prices[i]);
        }

        return ans;
    }
}
