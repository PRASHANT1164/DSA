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
       
      
// Fill zeros
for (int i = 0; i < zeroCount; i++) {
    nums[i] = 0;
}

// Fill ones
for (int i = zeroCount; i < zeroCount + oneCount; i++) {
    nums[i] = 1;
}

// Fill twos
for (int i = zeroCount + oneCount; i < zeroCount + oneCount + twoCount; i++) {
    nums[i] = 2;
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