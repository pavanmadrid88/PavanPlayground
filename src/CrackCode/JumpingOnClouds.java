package CrackCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpingOnClouds {

	public static void main(String[] args) {

		List<Integer> jumpingCloudList = Arrays.asList(0, 0, 0, 1, 0, 0);

		System.out.print(jumpingOnClouds(jumpingCloudList));

	}

	public static int jumpingOnClouds(List<Integer> c) {
		// Write your code here

		int playerCloudPosition = 0;
		int numberOfJumps = 0;
		int maxJumpCloudPosition = 0;
		int nextCloudPosition = 0;
		

		for (int i = 0; i < c.size();) {
			try {
			int currentCloudPosition = c.get(i);
			nextCloudPosition = c.get(i + 1);
			maxJumpCloudPosition = c.get(i + 2);
		} catch (Exception e) {
				// TODO: handle exception
			}

			if (maxJumpCloudPosition == 0) {
				playerCloudPosition =playerCloudPosition + 2;
				i = playerCloudPosition;
				numberOfJumps++;
			} else if (nextCloudPosition == 0) {
				playerCloudPosition =playerCloudPosition+ 1;
				i=playerCloudPosition;
				numberOfJumps++;
			} else {
				return 0;
			}

			if (playerCloudPosition == c.size() - 1) {
				return numberOfJumps;
			}

		}

		return numberOfJumps;

	}

}
