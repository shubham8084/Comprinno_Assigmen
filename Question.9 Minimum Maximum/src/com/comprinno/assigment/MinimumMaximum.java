package com.comprinno.assigment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MinimumMaximum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of test cases b/w 1 to 10::");
		int TestCase = sc.nextInt();

		// cheacking constraint 1 ≤ TestCase ≤ 10
		if (1 <= TestCase && TestCase <= 10) {
			// loop iteration according to testcases
			while (TestCase != 0) {

				// integer n denoting number of elements in Array and Array Size(A)
				int N = sc.nextInt();
				// ArraySize A
				int A = N;
				// cheacking constraint 1 ≤ A ≤ 10^5 and 2 ≤ N ≤ 50000
				if ((1 <= A && A <=10000) && (2 <= N && N <= 50000)) {

					// create a ArrayList of size n
					List<Integer> Array = new ArrayList<>();

					// enter space separated integers denoting the Array
					for (int i = 0; i < A; i++) {
						int ele = sc.nextInt();
						// insert the elements into Array
						Array.add(ele);

					} // end of for loop
					
                  // A  simple integer varibles thats calculate the cost
					int cost = 0;

					while (Array.size() > 1) {

						if (Array.get(0) > Array.get(1)) {
							cost = cost + Array.get(1);

							Array.remove(0);

						} // if
						else {
							cost = cost + Array.get(0);

							Array.remove(1);

						} // else

					} // while loop

					System.out.println(cost);

				} // end of if
				else {
					System.out.println("Invalid ! number and ArraySize must be b/w 1 to 10^5...");
				} // else

				TestCase--;
			} // end of while loop
		} // end of if

		else {
			System.out.println("Invalid ! Test cases must be b/w 1 to 10...");
		} // else

	}// end of main()

}// end of class
