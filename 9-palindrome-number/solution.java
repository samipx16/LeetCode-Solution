import java.io.*;
class Solution {
    public boolean isPalindrome(int x) { 
		String str = String.valueOf(x);
		        char ch;
		        String rev="";
				for(int i=0;i<str.length();i++){
		            ch = str.charAt(i);
		            rev=ch+rev;
		        }
        if (str.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
}
