package CrackCode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class SockMerchant {

	public static void main(String[] args) {

		//ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 1, 3, 2));

		List<Integer> numbers = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
		int pairCount = sockMerchant(9, numbers);
		
		System.out.print("PairCount:" + pairCount);
		
		
	}

	/*
	 * Complete the 'sockMerchant' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. INTEGER_ARRAY ar
	 */

	public static int sockMerchant(int n, List<Integer> ar) {

		// Write your code here
		int pairCount =0;
		
		Collections.sort(ar);

		for(int i=0;i<n;i++) {
			if(i<n-1 && ar.get(i) == ar.get(i+1)) {
				pairCount++;
				i=i+1;
			}
		}
		
		return pairCount;

	}

}
