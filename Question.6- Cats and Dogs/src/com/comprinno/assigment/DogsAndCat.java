package com.comprinno.assigment;

import java.util.Scanner;

public class DogsAndCat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of test cases b/w 1 to 100000::");
		int TestCase = sc.nextInt();

		if (1 <= TestCase && TestCase <= 100000) {
			// loop iteration according to testcases
			while (TestCase != 0) {
				/*
				 * three space separated varegers C, D, L denoting number of the cats, number of
				 * the dogs and number of legs of animals counted by Chef
				 */
				var C = sc.nextInt();
				var D = sc.nextInt();
				var L = sc.nextInt();

				// cheacking Constraints 1 ≤ C,D,L ≤ 10^9
				var MaxPowValue = (Math.pow(10, 9));
				if ((1 <= C && C <= MaxPowValue) && (1 <= D && D <= MaxPowValue) && (1 <= L && L <= MaxPowValue)) {

					// count number of legs of cat and dog
					var NumberOfCatslegs = C * 4;
					var NumberOfDogslegs = D * 4;
					/*
					 * Condition for maximun and minimun possibility of legs (maxlegs < L and
					 * minlegs < L)
					 */
					if ((8 + NumberOfDogslegs + NumberOfCatslegs) >= L
							&& L <= (8 + NumberOfDogslegs - NumberOfCatslegs)) {
						// cheacking given lega are divisible with Doges legs count or not
						if (L % NumberOfDogslegs == 0)
							System.out.println("yes");
						else
							System.out.println("no");

					} // end of if

					else {
						System.out.println("no");
					} // else
				} else {
					System.out.println("Invalid ! number of cat, dog and legs must be b/w 1 to 10^9...");
				} // end of else

				TestCase--;
			} // end of while loop
		} // end of if

		else {
			System.out.println("Invalid ! Test cases must be b/w 1 to 100000...");
		} // end of else

	}// end of main()

}// end of class
