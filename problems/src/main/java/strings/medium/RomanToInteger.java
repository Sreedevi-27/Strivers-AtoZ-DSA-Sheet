/*
Roman to Integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII,
which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.

Constraints:
1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */

package strings.medium;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int number=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='I') number++;
            else if(c=='V'){
                number += 5;
                if(i>0 && s.charAt(i-1)=='I') number-=2;
            }
            else if(c=='X'){
                number += 10;
                if(i>0 && s.charAt(i-1)=='I') number-=2;
            }
            else if(c=='L'){
                number += 50;
                if(i>0 && s.charAt(i-1)=='X') number-=20;
            }
            else if(c=='C'){
                number += 100;
                if(i>0 && s.charAt(i-1)=='X') number-=20;
            }
            else if(c=='D'){
                number += 500;
                if(i>0 && s.charAt(i-1)=='C') number-=200;
            }
            else if(c=='M'){
                number += 1000;
                if(i>0 && s.charAt(i-1)=='C') number-=200;
            }
        }
        return number;
    }
}
