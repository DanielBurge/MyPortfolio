// 1. Two Sum (arrays)
/*
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers, such that they each add up to the target
 */
import java.util.Arrays;

public class TwoSum {
	
	public static   int[] twoSum(int[] nums, int target) {
		for( int i = 0; i < nums.length; i++) {
			for(int j = i+1; j<nums.length;j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return nums;
	}
	public static void main(String[] args){
		
		System.out.println(Arrays.toString(
			      twoSum(new int[]{3, 6, 10, 14}, 9)));	
}}
	