class Solution {  
    public boolean isAnagram(String s, String t) {
        //your code goes here

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        if ( a.length!=b.length){
            return false;
           
        }

        boolean ans=false;

        Arrays.sort(a);
        Arrays.sort(b);
          
  

        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }else{
                ans=true;
            }
        }
         return ans;
    }
}