class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int []doubles = new int[nums.length*2];
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<doubles.length;i++){
            if(i<nums.length) doubles[i] = nums[i];
            else doubles[i] = nums[i-nums.length];
            
        }
        //System.out.println(Arrays.toString(doubles));
        for(int i=doubles.length-1;i>=0;i--){
            if(stack.isEmpty()) al.add(-1);
            else if(stack.size()>0 && stack.peek()>doubles[i]) al.add(stack.peek());
            else if(stack.size()>0 && stack.peek()<=doubles[i]){
                while(stack.size()>0 && stack.peek()<=doubles[i]) stack.pop();
                if(stack.isEmpty()) al.add(-1);
                else al.add(stack.peek());
            }
            stack.push(doubles[i]);
        }
       // System.out.println(al);
        int []ans = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--) ans[i] = al.get(doubles.length-1-i);
        return ans;
    }
}