package com.comprinno.assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderingTerm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of test cases b/w 1 to 1000::");
		int TestCase = sc.nextInt();

		// cheacking constraint 1 ≤ TestCase ≤ 1000
		if (1 <= TestCase && TestCase <= 1000) {

			// loop iteration according to testcases
			while (TestCase != 0) {
				// Declaring Three Array as person Skills
				List<Integer> P1Skills = null;
				List<Integer> P2Skills = null;
				List<Integer> P3Skills = null;
			//'one codition varible which is intially ture
				boolean condition = true;
                
				//for loop for reading the 3 person skill 3times
				for (int i = 0; i < 3; i++) {
					int s1 = sc.nextInt();
					int s2 = sc.nextInt();
					int s3 = sc.nextInt();

					// cheacking constraint 1 ≤ s1, s2, s3 ≤ 100
					if ((1 <= s1 && s1 <= 100) && (1 <= s2 && s2 <= 100) && (1 <= s3 && s3 <= 100)) {

						// get first person Skills as an Array
						if (i == 0) {
							//calls assingArray() which gives An Aarry with index value
							P1Skills = ArrayManipulation.assignArray(s1, s2, s3);
						}
						// get second person Skills as an Array
						else if (i == 1) {
							//calls assingArray() which gives An Aarry with index value
							P2Skills = ArrayManipulation.assignArray(s1, s2, s3);
						}
						// get third person Skills as an Array
						else {
							//calls assingArray() which gives An Aarry with index value
							P3Skills = ArrayManipulation.assignArray(s1, s2, s3);
						}

					} // if

				} // for loop

				//calculation the sun of All skill set present in given Array
				int P1SkillSum = ArrayManipulation.SumOfArray(P1Skills);
				int P2SkillSum = ArrayManipulation.SumOfArray(P2Skills);
				int P3SkillSum = ArrayManipulation.SumOfArray(P3Skills);
				
				// Sum of all person skill set shuold not be same
				if (P1SkillSum == P2SkillSum || P2SkillSum == P3SkillSum || P1SkillSum == P3SkillSum) {
					condition = false;
				}

				// main logic to fine all Combinations and Permutations
				else {
					//one count varible which is initialize as 0
					int count = 0;
					for (int j = 0; j < 2; j++) {
                         //chekin two or more index value r same or not
						if (P1Skills.get(j) == P2Skills.get(j) || P2Skills.get(j) == P3Skills.get(j)
								|| P1Skills.get(j) == P3Skills.get(j))
							//incresses count value 
							count++;
					}
					//count value less than 3 is managable becoz two index value may be same but more than that
					if (count >= 3)
						condition = false;

				} // end of else

				if (condition == true)
					System.out.println("yes");
				else
					System.out.println("no");

				TestCase--;
			} // end of while loop

		} // end of if

		else {
			System.out.println("Invalid ! Test cases must be b/w 1 to 1000...");
		} // else

	}// end of main()

}// end of class
