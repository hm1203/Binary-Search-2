Time complexity : O(log(n))to the base 2 - n refers to the size of numsnums array.We reduce the search space in half at every step.  
Space complexity : O(1)Constant extra space is used.
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no
// Your code here along with comments explaining your approach

class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if((mid == 0 || nums[mid-1] < nums[mid]) && (mid == nums.length-1 || nums[mid+1] < nums[mid])){
                return mid;
            }else if(mid != 0 && nums[mid-1] > nums[mid]){
                hi=mid-1;
            }else{
                lo = mid+1;
            }
        }
        return Integer.MAX_VALUE;
    }
}
