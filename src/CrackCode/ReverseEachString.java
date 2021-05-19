package CrackCode;

public class ReverseEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String givenString = "Welcome to Java";
		
		
		String reverseString = "";
		
		String[] splitGivenString = givenString.split(" ");
		
		
		for(int p=0;p<splitGivenString.length;p++) {
			String currentString = splitGivenString[p];
			String currentReverseString = "";
			for(int k=currentString.length() -1 ; k>=0; k--) {
				Character currentStringChar = currentString.charAt(k);
				currentReverseString =currentReverseString + currentStringChar;
			}
			reverseString = reverseString + currentReverseString + " ";
		}
		
		
		
		System.out.println("Reverse String:" + reverseString);
		

	}

}
