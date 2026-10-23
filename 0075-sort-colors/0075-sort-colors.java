class Solution {
    public void sortColors(int[] nums) {

        //MOST OPTIMAL APPRAOCH(DUTCH NATIONAL FLAG ALGORITHM)
          int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            else if (nums[mid] == 1) {
                mid++;
            }

            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }

        //BETTER APPROACH
        // int zeroCount=0;
        // int oneCount=0;
        // int twoCount=0;

        // for(int i =0;i<nums.length;i++){

        //     if(nums[i]==0){
        //         zeroCount++;
        //     }else if(nums[i]==1){
        //         oneCount++;
        //     }else{
        //         twoCount++;
        //     }
        // }
       
      
// Fill zeros
// for (int i = 0; i < zeroCount; i++) {
//     nums[i] = 0;
// }

// Fill ones
// for (int i = zeroCount; i < zeroCount + oneCount; i++) {
//     nums[i] = 1;
// }

// Fill twos
// for (int i = zeroCount + oneCount; i < zeroCount + oneCount + twoCount; i++) {
//     nums[i] = 2;
// }

        
        
        

                
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