class Solution {
    public int romanToInt(String s) {
        	int sum =0;
				//to store values
		        HashMap<Character,Integer> values = new HashMap<>();
		        values.put('I',1);
		        values.put('V',5);
		        values.put('X',10);
		        values.put('L',50);
		        values.put('C',100);
		        values.put('D',500);
		        values.put('M',1000);
		      for (int i=0;i<s.length();i++) {
		    	  if(s.charAt(i)=='V'||s.charAt(i)=='X') {
		    		  if(i>0 && s.charAt(i-1)=='I')sum=sum-2;
		    	  }
		    	  if(s.charAt(i)=='L'||s.charAt(i)=='C') {
		    		  if(i>0 && s.charAt(i-1)=='X')sum=sum-20;
		    	  }
		    	  if(s.charAt(i)=='D'||s.charAt(i)=='M') {
		    		  if(i>0 && s.charAt(i-1)=='C')sum=sum-200;
		    	  }
		    	  sum= sum+values.get(s.charAt(i));
		      }
		      return sum;
    }
}