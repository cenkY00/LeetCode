//Problem rotated sorted array'e benziyor [4,5,6,1,2,3]. Binary search kullanarak verdiğim örnekte 1'i bulmak ile aynı şey.


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
