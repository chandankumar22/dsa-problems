/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int searchInLeftOfPeak = bsearch(mountainArr, target, 0, peak);
        if(searchInLeftOfPeak != -1) return searchInLeftOfPeak;
        int searchInRightOfPeak = bsearch(mountainArr, target, peak, mountainArr.length()-1);
        return searchInRightOfPeak;
    }
    
    int findPeak(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;
        
        while (start < end){
            int mid = start + ((end - start)/2);
            if(mountainArr.get(mid) > mountainArr.get(mid+1)) end = mid;
            else start = mid + 1;
        }
        return start;
    }
    
    int bsearch(MountainArray mountainArr, int target, int start, int end){
        boolean isAscending = mountainArr.get(start) < mountainArr.get(end);
        int ans = -1;
        while(start <= end){
            int mid = start + ((end-start)/2);
            if(mountainArr.get(mid) == target){
                ans = mid;
                end = mid - 1;
                continue;
            }
            
            if(isAscending){
                if(mountainArr.get(mid) < target) start = mid + 1;
                else end = mid - 1;
            }else{
                if(mountainArr.get(mid) < target) end = mid - 1;
                else start = mid + 1;
            }
            
        }
        return ans;
    }
}