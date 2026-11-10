public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x){ 
        if (x.length() > 1) {
          if ((x.substring(x.length()-2).compareTo("ly")) == 0 ){
                return true;
           }else{ 
                return false;
            }
        } else {
          return false;
        }
    }

    public String conCat(String s1, String s2) {
        if (s1.length() > 0 && s2.length() > 0){
        if ((s1.substring(s1.length()-1).compareTo(s2.substring(0,1))) == 0) {
        return (s1 + s2.substring(1));
        }
        return (s1 + s2);
        } else {
            if (s1.length() > 0){
                return s1;
            } else {
                return s2;
            }
        }
    }

    public String withoutX(String s1) {
        String str = s1;
        if (s1.substring(0,1).compareTo("x") == 0) {
        str = s1.substring(1);
        }
        if (s1.substring(s1.length()-1).compareTo("x") == 0){
        str = str.substring(0,str.length()-1);
        }
        return str;
    }

    public String fizzString(String s1) {
        String str1 = "";
        String str2 = "";
        if (s1.substring(0,1).compareTo("f") == 0){
        str1 = "Fizz";
        }
        if (s1.substring(s1.length()-1).compareTo("b") == 0){
        str2 = "Buzz";
        }
        if (str1 == "" && str2 == ""){
            return s1;
        } else {
            return (str1 + str2);
        }
    }

    public String fizzString2(int x) {
        String strUNO = "";
        String strDOS = "";
        if (x % 3 == 0) {
        strUNO = "Fizz";
        }
        if (x % 5 == 0) {
        strDOS = "Buzz";
        }
        String x2 = x + "!";
        if (strUNO == "" && strDOS == ""){
            
            return (x2);
        } else {
            return (strUNO + strDOS + "!");
        }
    }

}
