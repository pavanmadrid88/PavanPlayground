package CrackCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ReverseArray {

	public static void main(String[] args) {

		
		
		List<Integer> inputArrayList = Arrays.asList( 1,2,3,4,5,6,7,8,9,10);
		
		System.out.print(reverseArray(inputArrayList));
		

	}

	public static List<Integer> reverseArray(List<Integer> a) {
		// Write your code here
		List<Integer> reverseArrayList = new ArrayList<>();
		int reverseArrayIndex = 0;
		
		for(int i=a.size()-1;i>=0;i--) {
			reverseArrayList.add(reverseArrayIndex,a.get(i));
			reverseArrayIndex++;
		}
		
		return reverseArrayList;
		
		

	}

}
