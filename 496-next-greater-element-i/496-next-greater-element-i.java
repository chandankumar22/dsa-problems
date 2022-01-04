class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> al = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            if(stack.isEmpty()){
                al.put(nums2[i],-1);
            }
            else if(stack.size()>=0 && stack.peek()>nums2[i]) al.put(nums2[i],stack.peek());
            else if(stack.size()>=0 && stack.peek()<=nums2[i]){
                while(!stack.isEmpty() && stack.peek()<=nums2[i]) stack.pop();
                if(stack.isEmpty()) al.put(nums2[i],-1);
                else al.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
  //      System.out.print(al);
        int []ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++) ans[i] = al.get(nums1[i]);
        return ans;
    }
}