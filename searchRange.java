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

*************************************************

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int p=0,q=nums.length-1;
        if (q==0 && nums[0]==target) {ans[0]=0;ans[1]=0;}
        while (p<=q) {
            if (nums[(q-p)/2+p]<target) {p=(q-p)/2+p+1;}
            else if (nums[(q-p)/2+p]>target) {q=(q-p)/2+p-1;}
            else {
                int i=(q-p)/2+p;
                //System.out.println("p="+p+";q="+q);
                while (i>=0 && nums[i]==target) {
                    i--;
                }
                ans[0]=i+1;
                i=(q-p)/2+p;
                while (i<nums.length && nums[i]==target) {
                    i++;
                }
                ans[1]=i-1;
                break;
            }
        }
        return ans;
    }
}
