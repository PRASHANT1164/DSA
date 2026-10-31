class Solution {
    public int majorityElement(int[] nums) {


        //OPTIMAL APPROACH

        //PHASE A-FINDING THE CANDIDATE WITH MAXIMUM OCCURENCES  OR MAX FREQUENCY

        int count=0;
        int element=0;

        for(int i =0;i<nums.length;i++){
            if(count==0){
                element=nums[i];
                count=1;
            }else if(nums[i]==element){
                count++;
            }else{
                count--;
            }
        }

        //PHASE B - VERIFYING IF OUR MOST APPEARED ELEMENT IS FREQUENT ENOUGHT TO BE A MAJORITY ELEMENT I.E. > N/2

        //AT THIS STAGE IN THE ELEMENT VARABLE WE HAVE THE MOST OCCURING ELEMENT STORED 

        int frequency=0;
        for(int i =0;i<nums.length;i++){
            if( nums[i]==element){
                frequency++;
            }
        }

        if(frequency>nums.length/2){
            return element;
        }
            return -1;
        
        
        // BRUTE FORCE APPROACH
        //   int n=nums.length;
        
        // for(int i=0;i<n;i++){

        //     int count=0;

        //     for(int j=0;j<n;j++){

        //         if(nums[i]==nums[j]){
        //             count ++;
        //         }
        //     }

        //     if(count>(n/2)){

        //         return nums[i];
        //     }
        // }

        // return -1;


        
    }
}