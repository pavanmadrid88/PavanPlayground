package CrackCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotationArray {
	
	public static void main(String[] args) {
		
		
		List<Integer> inputList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		System.out.println("Input array is:" + inputList);
		System.out.print(rotateLeft(2,inputList));
		
		
	}
	
	
	
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
	    // Write your code here
		
		if(d > arr.size()) {
			return null;
		}
		
		List<Integer> leftRotatedList = new ArrayList<Integer>(Collections.nCopies(arr.size(), 0));
		
		
		
		for(int i=0;i<arr.size();i++) {
			
			int newLeftRotatedIndex = i-d;
			if(newLeftRotatedIndex < 0) {
				newLeftRotatedIndex = newLeftRotatedIndex + arr.size();
			}
			leftRotatedList.set(newLeftRotatedIndex, arr.get(i));
			
		}
		
		
		
		
		return leftRotatedList;

	}

}
