class Solution {
    public void sortColors(int[] nums) {

        //BETTER APPROACH
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;

        for(int i =0;i<nums.length;i++){

            if(nums[i]==0){
                zeroCount++;
            }else if(nums[i]==1){
                oneCount++;
            }else{
                twoCount++;
            }
        }
        // to moniter the current index in the array so as to override it
        int j=0;

        for(int i=0 ;i<zeroCount;i++){
            nums[i]=0;
            j++;

        }
         for(int i=0 ;i<oneCount;i++){
            nums[j]=1;
            j++;

        }
         for(int i=0 ;i<twoCount;i++){
            nums[j]=2;
            j++;

        }

        
        
        

                
        // BRUTE FORCE (USING BUBBLE SORT )
        //  int j =0;
        
        //  while( j<nums.length){
            
        //    for(int i=0;i<nums.length-1;i++){
              
        //       if(nums[i]>nums[i+1]){
        //         int temp=nums[i];
        //         nums[i]=nums[i+1];
        //         nums[i+1]=temp;
        //       }
        //    }

        //    j++;

        //  }
        
    }
}