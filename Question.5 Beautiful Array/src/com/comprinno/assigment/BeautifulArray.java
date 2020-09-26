package com.comprinno.assigment;

import java.util.Scanner;

public class BeautifulArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of test cases b/w 1 to 10^6::");
		int TestCase = sc.nextInt();

		// cheacking constraint 1 ≤ TestCase ≤ 10^6
		if (1 <= TestCase && TestCase <= Math.pow(10, 6)) {
			// loop iteration according to testcases
			while (TestCase != 0) {

				// integer n denoting number of elements in Array(Array Size)
				int n = sc.nextInt();

				// cheacking constraint 1 ≤ n ≤ 10^5
				if (1 <= n && n <= Math.pow(10, 5)) {

					// create a Array of size n

					int Array[] = new int[n];

					// enter space separated integers denoting the Array
					for (int i = 0; i < n; i++) {
						int ele = sc.nextInt();
						// insert the elements into Array
						Array[i] = ele;
					} // end of for loop

					// b.logic on Array to calculate ak= ai * aj
					for (int i = 0; i < Array.length - 1; i++) {

						int Ak = Array[i] * Array[i + 1];
						if (Ak == Array[i] || Ak == Array[i + 1])
							// printing the output as yes
							System.out.println("yes");
						else
							// printing the output as no
							System.out.println("no");

					} // outer for loop

				} // end of if
				else {
					System.out.println("Invalid ! number of sticks must be b/w 1 to 10^5...");
				} // else

				TestCase--;
			} // end of while loop
		} // end of if

		else {
			System.out.println("Invalid ! Test cases must be b/w 1 to 10^6...");
		} // else

	}// end of main()

}// end of class
