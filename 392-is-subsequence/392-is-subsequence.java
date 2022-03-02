class Solution {
    public boolean isSubsequence(String s, String t) {
        int start = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            boolean flag = false;
            for(int j=start;j<t.length();j++){
                char d = t.charAt(j);
                if(c==d){
                    start=j+1;
                    flag=true;
                    break;
                }
            }
            if(!flag) return false;
        }
        return true;
    }
}