package CrackCode;

public class FindDuplicateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input = {"Amazon","GCP","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP"};

		
		
		for(int i=0;i<input.length;i++) {
			int duplicateCount = 1;
			String currentString = input[i];
			
			for(int j=0;j<input.length;j++) {
				String compareString = input[j];
				if(i!=j && compareString == currentString) {
					duplicateCount++;					
				}
			}
			
			System.out.println("String :" + currentString + " occurs:" + duplicateCount + " times");
		}
		
		
		

	}
	
	
	
	
	

}
