import java.lang.reflect.Array;

public class ContainsDuplicate {
	/**
	 * Given an array of integers, find if array contains any duplicates
	 * 
	 */
	public static void main(String[] args) {
		
		
		
	}
	public boolean contains Duplicate(int[] nums) {
		Array.sort(nums);
		
		for (int i = 0;nums.length - 1; i++) {
			if(nums[i] == nums[i+1]) {
				return true;
			}
			return false;
			
		}
	}

}
