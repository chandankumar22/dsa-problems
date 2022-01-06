class Solution {
    
  HashSet<Character> set = new HashSet<>();
    
    public int longestBeautifulSubstring(String word) {
        int []dp = new int[word.length()];
        dp[0]=1;
        int ans=0;
        set.add(word.charAt(0));
        for(int i=1;i<word.length();i++){
            char currChar = word.charAt(i);
            char prevChar = word.charAt(i-1);
            if(currChar>=prevChar){
                dp[i] = dp[i-1]+1;
            }else {
                set.clear();
                dp[i] = 1;
            }
            set.add(currChar);
           if(set.size()==5) ans= Math.max(dp[i],ans);
            
        }
//         HashMap<Character, Boolean> map = new HashMap<>();
        
//         map.put(word.charAt(0),true);
//         for(int i=1;i<dp.length;i++){
           
//             if(dp[i-1]>dp[i]){
//                 if(map.size()==5) ans= Math.max(dp[i-1],ans);
//                 else map.clear();
//             } 
//             map.put(word.charAt(i),true);
//         }
         // if(map.size()==5) ans= Math.max(dp[word.length()-1],ans);
        // System.out.println(Arrays.toString(dp));
        return ans;
    }
}