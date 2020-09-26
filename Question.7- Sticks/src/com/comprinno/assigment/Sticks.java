package com.comprinno.assigment;

import java.util.Scanner;

public class Sticks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of test cases b/w 1 to 100::");
		int TestCase = sc.nextInt();

		// cheacking constraint 1 ≤ Testcase ≤ 100
		if (1 <= TestCase && TestCase <= 100) {
			// loop iteration according to testcases
			while (TestCase != 0) {

				// varible which store duplicate element count
				int count = 0;
				System.out.println("Enetr number of Stick::");
				int n = sc.nextInt();
				// cheacking constraint 1 ≤ number of sticks ≤ 1000
				if (1 <= n && n <= 1000) {

					// create a Array of size n
					int SticksArray[] = new int[n];

					System.out.println("Enter Space-separated integers lengths of sticks");
					for (int i = 0; i < n; i++) {
						int ele = sc.nextInt();
						// cheacking constraint 1 ≤ length of sticks ≤ 1000
						if (1 <= ele && ele <= 1000)
							// Add length of stick as array in StickArray
							SticksArray[i] = ele;
						else
							System.out.println("Strick length be b/w 1 to 1000...");
					} // end of for loop

					// Searches for duplicate element in StickArray
					for (int i = 0; i < SticksArray.length; i++) {
						for (int j = i + 1; j < SticksArray.length; j++) {
							// comparing array index to fine duplictes elements
							if (SticksArray[i] == SticksArray[j])
								// count represents the number of duplicate element forund
								count++;
						} // inner for loop
					} // outer for loop

					System.out.println(count);
					if (count > 1) {
						// find the factorial of duplicates number of elements
						int factorial = count;
						while (count > 1) {
							factorial = factorial * (count - 1);
							count--;
						}
						// print number of possible Rectangler
						System.out.println("Maximum possible area for rectangle is::" + factorial);
					} // if
					else
						// It's impossible to choose 4 sticks so that they form a rectangle
						System.out.println("-1");

				} // end of if
				else {
					System.out.println("Invalid ! number of sticks must be b/w 1 to 1000...");
				} // else

				TestCase--;
			} // end of while loop
		} // end of if

		else {
			System.out.println("Invalid ! Test cases must be b/w 1 to 100...");
		} // else

	}// end of main()

}// end of class
