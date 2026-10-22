class Solution {
    public int[] twoSum(int[] nums, int target) {
        // BETTER APPROACH
        int[] temp = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int moreNeeded = target - nums[i];

            if (map.containsKey(moreNeeded)) {

                temp[0] = map.get(moreNeeded);
                temp[1] = i;

                return temp;
            }

            map.put(nums[i], i);
        }

        return temp;
        //BRUTE FORCE APPROACH
        //   int[] temp=new int[2];


        // for ( int i=0 ; i<nums.length;i++){

        //     for(int j =i+1;j<nums.length;j++){

        //         if(nums[i]+nums[j]==target){

                    
        //             temp[0]=i;
        //             temp[1]=j;
        //             break;
                    
        //                   }
        //     }
        // }


        // return temp; 
        
    }
}