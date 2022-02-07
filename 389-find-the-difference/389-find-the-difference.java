class Solution {
    public char findTheDifference(String s, String t) {
       HashMap<Character,Integer> map = new HashMap<>();
       HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(map.containsKey(c)){
                if(map1.get(c)==map.get(c)+1) return c;
            }else return c;
        }
        return 'a';
    }
}