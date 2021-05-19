package CrackCode;

public class SwapTwoNumbersAndReverse {
	
	public static void main(String[] args) {
		
		
		swap(500000000,750000000);
		
		reverse(79996);
		
		reverseString("PAVAN");
		
		numberLength(123456789);
		
		
	}
	
	public static void swap(int a,int b) {
		
		System.out.println("BEFORE SWAP. A = " + a + "---------- B = " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("AFTER SWAP. A = " + a + "---------- B = " + b);
		
		
	}
	
	
	public static void reverse(int num) {
		
		System.out.println("Given Num:" + num);
		
		int rev = 0;
		
		while(num!=0) {
			
			rev = rev*10 + num % 10;
			num = num / 10;
			
		}
		
		System.out.println("Reverse:" + rev);
	}
	
	
	public static void reverseString(String givenString) {
		System.out.println("GIVEN String:" + givenString);
		
		String reverseString = "";
		for(int i=givenString.length()-1; i>=0;i--) {
			reverseString = reverseString + givenString.charAt(i);
		}
		
		System.out.println("REVERSE String:" + reverseString);
	}
	
	
	public static void numberLength(int num) {
		
		int orginalNumber = num;
		int numLength = 0;
		while(num !=0) {
			num = num /10;
			numLength++;
			
		}
		
		System.out.println("Length of number:" + orginalNumber + " is :" + numLength);
		
		
	}

}
