class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
            int start = 0;
            int end = letters.length-1;
            while(start<=end){
                int mid = start + ((end-start)/2);
                if(letters[mid] < target) start = mid + 1;
                else if(letters[mid] > target) end = mid - 1;
                else {
                    if(mid == letters.length-1) return letters[0];
                    start = mid + 1; // because we need next greater number, so searching in right
                }
            }
            if(start == letters.length) return letters[0];
            return letters[start];

    }
}