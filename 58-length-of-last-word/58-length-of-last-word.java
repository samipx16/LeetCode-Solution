class Solution {
    public int lengthOfLastWord(String s) {
      
		String[] word = s.split(" ");
		String finalWord = "";
		for(int i=0; i< word.length;i++) {
			if(i+1==word.length) {
				finalWord = word[i];
			}
			
		}
        return finalWord.length();
    }
}