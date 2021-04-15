class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        boolean flag=false;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==target && !flag) {ans[0]=i;flag=true;}
            if (i==nums.length-1 && nums[i]==target) {ans[1]=i;}
            if (nums[i]>target && flag) {ans[1]=i-1;flag=false;}
        }
        return ans;
    }
}
