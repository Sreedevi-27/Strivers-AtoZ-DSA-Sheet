/*
Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */

package arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int numsLength = nums.length;
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numsLength; i++){
            int element = target-nums[i];
            if(map.containsKey(element)){
                result[0] = i;
                result[1] = map.get(element);
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
