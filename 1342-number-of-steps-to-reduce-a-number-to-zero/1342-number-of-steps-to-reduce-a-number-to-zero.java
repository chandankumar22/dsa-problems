class Solution {
    
    public int numberOfSteps(int num) {
        int ans = 0;
        while(num!=0){
            if(num%2==0) num/=2;
            else num--;
            ans++;
        }
        return ans;
    }
    
    public int count(int num, int count){
        if(num==0) return count;
        int x = num/2;
        if(x%2==0) return count(x,count+1);
        return count(num-1,count+1);
    }
}