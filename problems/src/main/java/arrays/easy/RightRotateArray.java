/*
Right Rotate Array

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105

 */
package arrays.easy;

public class RightRotateArray {
    public static int[] rotateArray(int[] arr, int k) {
        int arrLength = arr.length;
        int[] result = new int[arrLength];
        for(int i=0; i<arrLength; i++)
            result[i] = arr[i];

        for(int i=0; i<arrLength; i++)
            result[(i+k)%arrLength] = arr[i];

        return result;
    }
}
