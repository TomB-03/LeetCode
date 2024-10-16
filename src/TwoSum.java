/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */


//first Solution -> Time O(n^2)
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ergebnis = {0,0};
        for (int i = 0; i <= nums.length - 1; i++){
            int current = nums[i];

            for (int j = i +1; j <= nums.length - 1; j++){
                if(current + nums[j] == target){
                    ergebnis[0] = i;
                    ergebnis[1] = j;

                }
            }
        }
        return ergebnis;
    }
}
