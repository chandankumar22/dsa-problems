class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []words = s.split(" ");
        if(pattern.length()!=words.length) return false;
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> revMap = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
           // System.out.println(map);
            String str = map.get(pattern.charAt(i));
            Character c = revMap.get(words[i]);
            if((str==null && c!=null)||(c==null && str!=null)) return false;
            if(str==null){
              map.put(pattern.charAt(i),words[i]);
              revMap.put(words[i],pattern.charAt(i));
            } 
            else if(!str.equals(words[i]) || c!=pattern.charAt(i)) return false;
        }
        return true;
    }
}