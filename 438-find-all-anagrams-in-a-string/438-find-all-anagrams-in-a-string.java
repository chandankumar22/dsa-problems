class Solution {
    
        List<Integer> ans = new ArrayList<>();
    
    public List<Integer> findAnagrams(String s1, String s2) {
        if(s2.length()>s1.length()) return ans;
        
        int []s11 = new int[26];
        int []s22 = new int[26];
        for(char c : s2.toCharArray()) s22[c-'a']++;
        for(int i=0;i<s2.length();i++){
            char c = s1.charAt(i);
            s11[c-'a']++;
        }
        
        //System.out.println(Arrays.toString(s11));
        //System.out.println(Arrays.toString(s22));
        
        
        boolean map = checkMaps(s11,s22,0);
        if(!map && s1.length()==1&&s2.length()==1) return ans;
        
        
        s11[s1.charAt(0)-'a']--;
        int start = 1;
        int end = s2.length();
        if(end>=s1.length()) return ans;
        s11[s1.charAt(end)-'a']++;
        
          //System.out.println(Arrays.toString(s11));
        
        while(end<s1.length()){
           checkMaps(s11,s22,start);
            s11[s1.charAt(start)-'a']--;
            start++;
            end++;
            if(end!=s1.length()) s11[s1.charAt(end)-'a']++;
        }
        return ans;
    }
    
    public boolean checkMaps(int []s1, int []s2,int start){
        for(int i=0;i<26;i++){
            if(s1[i]!=s2[i]) return false;
        }
        ans.add(start);
        return true;
    }
}