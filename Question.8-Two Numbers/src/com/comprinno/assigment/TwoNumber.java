package com.comprinno.assigment;

import java.util.Scanner;

public class TwoNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of test cases b/w 1 to 100::");
		int TestCase = sc.nextInt();

		// checking constraint 1 ≤ Testcase ≤ 100
		if (1 <= TestCase && TestCase <= 100) {
			// loop iterration according to test cases
			while (TestCase != 0) {
				// Alice initial number
				var A = sc.nextInt();
				// Bob initial number
				var B = sc.nextInt();
				// Number of turn
				var N = sc.nextInt();

				/*
				 * checking constraint 1 ≤ A ≤ 1000000000 && 1 ≤ B ≤ 1000000000 && 1 ≤ N ≤
				 * 1000000000
				 */
				if ((1 <= A && A <= 1000000000) && (1 <= B && B <= 1000000000) && (1 <= N && N <= 1000000000)) {
					// some varibles declaration
					var C = A;
					var D = B;
					var max = 0;
					var min = 0;
					// loop iteration according to Numner turns(N)
					while (N > 0) {
						// Alice turn so assign C first
						C = C * 2;
						// Bob turn so Assign D after Alice turn
						if (--N > 0)
							D = D * 2;
						// decrement of number of turn
						N--;

					} // end of inner while loop(end of turns)
						// checking for max and min value
					if (C > D) {
						max = C;
						min = D;
					} else {
						max = D;
						min = C;
					}
					// display max(C,D)/min(C, D) as output
					System.out.println(max / min);

				} // end of inner if
					// decrement the number of test cases by one
				TestCase--;
			} // end of while loop(end of test Cases)

		} // end of if

		else {
			System.out.println("Invalid ! Test cases must be b/w 1 to 1000...");
		} // else

	}// end of main()

}
