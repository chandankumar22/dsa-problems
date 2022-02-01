class NumArray {
    
    int []pr;

    public NumArray(int[] nums) {
        pr = new int[nums.length+1];
        pr[0] = 0;
        for(int i=0;i<nums.length;i++) pr[i+1] = pr[i]+nums[i];
    //    System.out.println(Arrays.toString(pr));
    }
    
    public int sumRange(int left, int right) {
        return pr[right+1]-pr[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */