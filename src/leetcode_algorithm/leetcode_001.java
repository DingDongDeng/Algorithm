package leetcode_algorithm;

public class leetcode_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums;
		int[] answer;
		int target = 0;
		
		nums = new int[]{2,7,11,15};
		target = 13;
		
		// Solution Ŭ���� ����
		Solution s = new Solution(); 
		
		answer = s.twoSum(nums, target);
		
		System.out.println("[" + answer[0] + "]" + "[" + answer[1] + "]");
	}
	
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
		int[] answer = new int[2];
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				// �ַ�� ã����
				if(nums[i] + nums[j] == target) {
					answer[0] = i;
					answer[1] = j;
					return answer;
				}
			}
		}
		
		// �ַ�� ��ã���� ����
		System.out.println("����.");
		System.exit(0);
		
	    return answer;
    }

}