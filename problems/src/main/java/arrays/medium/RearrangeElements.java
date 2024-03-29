/*
Rearrange Array Elements by Sign

You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
You should rearrange the elements of nums such that the modified array follows the given conditions:
Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

Example 1:
Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.

Constraints:
2 <= nums.length <= 2 * 105
nums.length is even
1 <= |nums[i]| <= 105
nums consists of equal number of positive and negative integers.
 */

package arrays.medium;

public class RearrangeElements {
    public static int[] rearrangeArray(int[] nums) {
        int numsLength = nums.length;
        int[] resultArray = new int[numsLength];
        int pos=0, neg=1, i=0;
        while(i<numsLength){
            if(nums[i]>0){
                resultArray[pos]=nums[i];
                pos+=2;
            } else{
                resultArray[neg]=nums[i];
                neg+=2;
            }
            i++;
        }
        return resultArray;
    }
}
