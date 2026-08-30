/**
 *    author:  Lunero
 *    created: 30.08.2026 07:40:08
 *    link: https://leetcode.com/problems/removing-minimum-and-maximum-from-array/description/?envType=daily-question&envId=2026-08-30
**/

class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        int min = nums[0];
        int max = nums[0];

        boolean minFirst;

        for (int i = 1 ; i < n ; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        minFirst = minIndex < maxIndex;

        int result = n;
        int a, b, c;

        if (minFirst) {
            a = maxIndex + 1;
            b = 1 + minIndex + (n - maxIndex);
            c = n - minIndex;
        } else {
            a = minIndex + 1;
            b = 1 + maxIndex + (n - minIndex);
            c = n - maxIndex;
        }

        if (a <= b && a <= c)
            result = a;
        else if (b <= a && b <= c)
            result = b;
        else
            result = c;

        return result;
    }
}