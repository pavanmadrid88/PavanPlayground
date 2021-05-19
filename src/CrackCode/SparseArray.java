package CrackCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArray {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");

		List<String> queries = Arrays.asList("aba", "xzxb", "ab");
		
		System.out.println(matchingStrings(strings, queries));

	}

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		// Write your code here
		List<Integer> matchStringList = new ArrayList<>();
		
		
		for(int i=0;i<queries.size();i++) {
			
			String currentQuery = queries.get(i);
			int currentQueryMatchCount = 0;
			for(int j=0;j<strings.size();j++) {
				String currentString = strings.get(j);
				if(currentString.startsWith(currentQuery) && currentString.length() == currentQuery.length()) {
					currentQueryMatchCount++;
				}
			}
			matchStringList.add(i, currentQueryMatchCount);
			
		}
		
		return matchStringList;
		
		

	}

}
