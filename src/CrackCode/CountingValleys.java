package CrackCode;

public class CountingValleys {

	public static void main(String[] args) {

		int valleyCount = countingValleys(8, "DDUUUUDD");

		System.out.print("Number of valleys:" + valleyCount);
	}

	public static int countingValleys(int steps, String path) {

		// Write your code here

		int level = 0;
		int valleyCount = 0;
		for (int i = 0; i < path.length(); i++) {
			Character currentChar = path.charAt(i);
			if(currentChar == 'D') level--;
			if(currentChar == 'U') level++;
			
			if(level == 0 && currentChar == 'U') {
				valleyCount++;
			}
		}
		
		return valleyCount;

	}

}
