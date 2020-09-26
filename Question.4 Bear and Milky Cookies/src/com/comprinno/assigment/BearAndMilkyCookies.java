package com.comprinno.assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BearAndMilkyCookies {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of test cases b/w 1 to 50::");
		int TestCase = sc.nextInt();

		// checking constraint 1 ≤ Testcase ≤ 50
		if (1 <= TestCase && TestCase <= 50) {
			// loop iterration according to test cases
			while (TestCase != 0) {
				// Integer N stores the number of minutes
				int N = sc.nextInt();
				// checking constraint 1 ≤ number of Minutes ≤ 50
				if (1 <= N && N <= 50) {
					// declare an ArrayList as list and its store String as data(Becoz list
					// preserved insertion order)
					List<String> list = new ArrayList<>();
					// repeat the loop according to number minutes
					while (N > 0) {
						// taking a input from user as String
						String S = sc.next();
						// checkin given input string is either cookie or milk
						if ((S.equalsIgnoreCase("cookie")) || (S.equalsIgnoreCase("milk"))) {
							// store the input as ArrayList
							list.add(S);
						} // if
						else
							// if input not either milk or Cookies
							System.out.println("Invalid! You input must be either milk or Cookies..");
						// Decresses the Number of mints by 1
						N--;
					} // while

					// Logic to fine Limak follow his parents instruction or not
					// lets intitally Instruction is ture
					boolean instruction = true;
					/* Limak's parents have instructed him, that after eating a cookie, he
					has to drink milk in the next minute so can't eat cookie at the end  */
					if(list.get(list.size()-1).equalsIgnoreCase("cookie")) 
						instruction=false;
					
					//for loop to find after cookie he must take milk 
					for (int i = 0; i < list.size() - 1; i++) {
						if (list.get(i).equalsIgnoreCase("cookie") && list.get(i + 1).equalsIgnoreCase("cookie")
								)
						{	// Here Limak do not follow his parents instruction so instructio become false
							instruction = false;
							break;
						}
					} // end of for loop

					// print the output based on Instruction true or false
					if (instruction == false)
						// instruction false it means not follow the instruction
						System.out.println("NO");
					else
						// instruction still true it means follow the instruction
						System.out.println("YES");

				} // end of if(Cheking Number of mints with in limit or not)
				else {
					System.out.println("Invalid ! Numbers of mint must be b/w 1 to 50...");
				} // else

				TestCase--;
			} // end of while loop(end of test Cases)

		} // end of if

		else {
			System.out.println("Invalid ! Test cases must be b/w 1 to 50...");
		} // else

	}// end of main()

}/// class
