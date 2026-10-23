class Solution {
    public int removeDuplicates(int[] nums) {

        int[] temp=new int[nums.length];

       temp[0] = nums[0];
       int j = 1;

        for(int i=1;i<nums.length;i++){

            if(nums[i]!=nums[i-1]){

                temp[j]=nums[i];
                j++;

            } 

        }
          for(int i=0; i<j;i++){

                nums[i]=temp[i];
            }

          

       return j;

    }
}