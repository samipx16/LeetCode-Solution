class Solution {
    public int lengthOfLastWord(String s) {
      
		String[] word = s.split(" ");
		int length = word.length;
		String finalWord = word[length-1];
        return finalWord.length();
    }
}