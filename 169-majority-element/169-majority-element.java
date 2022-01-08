class Solution {
    public int majorityElement(int[] nums) {
        int maj = 0,count = 0;
	for(int i:nums){
		if(count == 0) maj = i;
		if (i == maj) count++;
		else count--;
	}
	return maj;
    }
}