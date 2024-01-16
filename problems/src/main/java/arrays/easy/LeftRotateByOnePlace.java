/*
Left Rotate an Array by One

Given an array 'arr' containing 'n' elements, rotate this array left once and return it. Rotating the array left by one
means shifting all elements by one place to the left and moving the first element to the last position in the array.

Example:
Input: 'a' = 5, 'arr' = [1, 2, 3, 4, 5]
Output: [2, 3, 4, 5, 1]
Explanation: We moved the 2nd element to the 1st position, and 3rd element to the 2nd position, and 4th element to the
3rd position, and the 5th element to the 4th position, and move the 1st element to the 5th position.

Expected time complexity:
O( n ), Where ‘n’ is the size of an input array ‘arr’.

Constraints :
1 <= 'n' <= 10^5
1 <= 'arr[i] <= 10^9
Time Limit: 1 sec
 */

package arrays.easy;

public class LeftRotateByOnePlace {
    static int[] rotateArray(int[] arr) {
        int first = arr[0], n = arr.length;
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = first;
        return arr;
    }
}
