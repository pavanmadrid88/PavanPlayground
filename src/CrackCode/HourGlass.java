package CrackCode;

import java.util.*;

public class HourGlass {

	public static void main(String[] args) {

		int[][] input2DArray = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

		System.out.print("The max hourglass SUM:" + hourglassSum(input2DArray));

	}

	public static int hourglassSum(int[][] inputArray) {

		int maxHourGlassSum = 0;
		List<Integer> hourGlassSumList = new ArrayList<>();

		for (int row = 0; row < inputArray.length; row++) {

			for (int col = 0; col < inputArray[row].length; col++) {
				int arrayElement = inputArray[row][col];
				try {
					int hourGlassSum = inputArray[row][col] + inputArray[row][col + 1] + inputArray[row][col + 2]
							+ inputArray[row + 1][col + 1] + inputArray[row + 2][col] + inputArray[row+2][col + 1]
							+ inputArray[row+2][col + 2];
					hourGlassSumList.add(hourGlassSum);
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		}

		maxHourGlassSum =  Collections.max(hourGlassSumList);
		
		return maxHourGlassSum;

	}
	
	public static int hourglassSumList(List<List<Integer>> arr) {

		int maxHourGlassSum = 0;
		List<Integer> hourGlassSumList = new ArrayList<>();

		for (int row = 0; row < arr.size(); row++) {

			for (int col = 0; col < arr.get(row).size(); col++) {
				int arrayElement = arr.get(row).get(col);
				try {
					int hourGlassSum = arr.get(row).get(col) + arr.get(row).get(col+1) + arr.get(row).get(col+2)
							+ arr.get(row+1).get(col+1) + arr.get(row+2).get(col) + arr.get(row+2).get(col+1)
							+ arr.get(row+2).get(col+2);
					hourGlassSumList.add(hourGlassSum);
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		}

		maxHourGlassSum =  Collections.max(hourGlassSumList);
		
		return maxHourGlassSum;

	}

}
