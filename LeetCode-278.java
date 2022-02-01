//API bool isBadVersion(version) which returns whether version is bad was given.
// You are given array that has n elements, you should find bad version of the element of array that return true with isBadVersion method.



/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int first = 1;
        int last = n;
        int mid;
        
        int result = n;
        
        while(first <= last){
            mid = first + ( last - first ) / 2;
            if(isBadVersion(mid)){
                last = mid-1;
                result = mid;
            }else{
                first = mid+1;
            }
        }
        
        
        return result;
    }
}
