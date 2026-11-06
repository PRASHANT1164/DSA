
class Solution {
    public String capitalizeTitle(String title) {

        // SIMPLE WAY 

        

      StringBuilder str = new StringBuilder(title);
      /*
       StringBuilder str = new StringBuilder(title.toLowerCase());

         for(int i=0;i<str.length();i++){

            if(i==0||str.charAt(i-1)==32){
                str.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            }
        }
        

        return str.toString();*/

       int start = 0;

        for (int i = 0; i <= str.length(); i++) {

            if (i == str.length() || str.charAt(i) == ' ') {

                int len = i - start;

                if (len <= 2) {

                    for (int j = start; j < i; j++) {
                        str.setCharAt(j,
                            Character.toLowerCase(str.charAt(j)));
                    }

                } else {

                    str.setCharAt(start,
                        Character.toUpperCase(str.charAt(start)));

                    for (int j = start + 1; j < i; j++) {
                        str.setCharAt(j,
                            Character.toLowerCase(str.charAt(j)));
                    }
                }

                start = i + 1;
            }
        }

        return str.toString();
    }
}
