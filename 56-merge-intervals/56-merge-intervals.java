class Solution {
    public int[][] merge(int[][] intervals) {
        List<int []> ans = new ArrayList<>();
        Arrays.sort(intervals,(i1,i2)->{
            if(i1[0]>i2[0])return 1;
            else if(i1[0]<i2[0]) return -1;
            return 0;
        });
        ans.add(intervals[0]);
        int j=1;
        for(int i=1;i<intervals.length;i++){
            int []a = ans.get(j-1);
            if(a[1]>=intervals[i][0]){
                a[1]=Math.max(a[1],intervals[i][1]);
                ans.set(j-1,a);
            }else{
                 ans.add(intervals[i]);
                j++;
            }
        }
        
        int arr[][] = new int[ans.size()][2];
        arr = ans.toArray(arr);
        return arr;
    }
}