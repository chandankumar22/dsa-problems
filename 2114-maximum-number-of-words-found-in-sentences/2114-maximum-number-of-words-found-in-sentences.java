class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(String s:sentences){
            String []words = s.split(" ");
            max = Math.max(words.length,max);
        }
        return max;
    }
}