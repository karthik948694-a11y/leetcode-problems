class Solution {
    public void moveZeroes(int[] nums) {
        int zero=0;
        int ic=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zero++;
            }
            else{
                nums[ic]=nums[i];
                ic++;
            }
        }

        for(int j=zero;j>0;j--)
        {
            nums[ic]=0;
            ic++;
        }

    }
}