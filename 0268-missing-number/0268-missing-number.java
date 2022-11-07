class Solution {
    public int missingNumber(int[] arr) {
        
        int i = 0;
        while(i < arr.length){
            if(arr[i] == arr.length) swap(i++, arr.length-1, arr);
            else if(arr[i] != i){
                if(i == arr.length-1 && arr[i] == arr.length) continue;
              swap(i, arr[i], arr);  
            } 
            else i++;                 
        }
        
        for(i = 0; i<arr.length; i++){
            if(i != arr[i] ) return i;
        }
        
        return arr.length;
    }
    
    public void swap(int i, int j, int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}