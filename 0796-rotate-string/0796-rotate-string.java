class Solution {
    public boolean rotateString(String s, String goal) {

         if(s.length()!=goal.length()){
            return false;
        }
       
      String s1=s+s;
      boolean ans= false;

       

       for(int i=0;i<s1.length();i++){
        if(s1.indexOf(goal)==-1){
            return false;
        }else{
            ans=true;
        }
       }

       return ans;
        
    }
}