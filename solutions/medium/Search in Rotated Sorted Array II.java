// Title: Search in Rotated Sorted Array II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

                continue;
                low++;
                high--;
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {

            if (nums[mid] == target) {
                return true;
            }

           
            }

            
            if (nums[low] <= nums[mid]) {

                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
