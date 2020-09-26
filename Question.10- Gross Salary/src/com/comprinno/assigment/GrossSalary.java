package com.comprinno.assigment;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of test cases b/w 1 to 1000::");
		int TestCase = sc.nextInt();

		// cheacking constraint 1 ≤ Testcase ≤ 1000
		if (1 <= TestCase && TestCase <= 1000) {
			// loop iteration according to testcases
			while (TestCase != 0) {
				System.out.print("Enter Basic salary::");
				int BasicSalary = sc.nextInt();

				//// checking constraint 1 ≤ salary ≤ 100000
				if (1 <= BasicSalary && BasicSalary <= 100000) {
					// Since salary less than 1500
					// calegories the salary based on its Amount
					if (BasicSalary < 1500) {
						// calculate HRA from basic Salay which is 10% of Basic salary
						var HRA = BasicSalary * 0.10;
						// calculate DA from basic Salay which 90% of Basic salary
						var DA = BasicSalary * 0.90;

						// calls getGrossSalary method And display the GrossSalary
						System.out.println("GrossSalary Is::" + GrossSalary.getGrossSalary(BasicSalary, HRA, DA));
					} // if
					else {
						// Since salary more than 1500 so Assign 500 as HRA
						var HRA = 500;
						// calculate DA from basic Salary which is 98% of basic salary
						var DA = BasicSalary * .98;
						// calls getGrossSalary method And display the GrossSalary
						System.out.println("GrossSalary Is::" + GrossSalary.getGrossSalary(BasicSalary, HRA, DA));
					} // else

				} // end of inner if

				else {
					System.out.println("Invalid ! salary must be b/w 1 to 100000...");
				} // else
					// decrement number of test cases by one
				TestCase--;
			} // end of while loop
		} // end of if

		else {
			System.out.println("Invalid ! Test cases must be b/w 1 to 1000...");
		} // else

	}// end of main()

	// getGrossSalary() contains logic to calculate GrossSalary and returns
	// GrossSalary
	public static double getGrossSalary(int BasicSalary, double HRA, double DA) {
		var GrossSalary = BasicSalary + HRA + DA;
		return GrossSalary;
	}

}// end of class
