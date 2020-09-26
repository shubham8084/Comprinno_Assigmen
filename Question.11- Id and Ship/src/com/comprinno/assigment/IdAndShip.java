package com.comprinno.assigment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IdAndShip {

	public static void main(String[] args) {
		// Creating HashMap where key and value both are String
		HashMap<String, String> map = new HashMap<String, String>();
		// Puting the elements in table
		map.put("B", "BattleShip");
		map.put("C", "Cruiser");
		map.put("D", "Destroyer");
		map.put("F", "Frigate");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of test Cases b/w 1 to 1000::");
		int TestCase = sc.nextInt();
		// taking constraint 1 ≤ TestCases ≤ 1000
		if (1 <= TestCase && TestCase <= 1000) {
			// loop repeation according to our test cases
			while (TestCase != 0) {
				// reading key as a input
				String key = sc.next();
				// checking giving key is match with out table key or not
				if (key.equalsIgnoreCase("B"))
					//priting Value based on key
					System.out.println(map.get("B"));
				else if (key.equalsIgnoreCase("C"))
					System.out.println(map.get("C"));
				else if (key.equalsIgnoreCase("D"))
					System.out.println(map.get("D"));
				else if (key.equalsIgnoreCase("F"))
					System.out.println(map.get("F"));
				else
					System.out.println("Invalid ! key [" + key + "] not there try Another one.....");

				// reduce the number of test cases by 1
				TestCase--;
			} // end of while loop
		} // end of if
		else
			System.out.println("Invalid ! Test cases must be b/w 1 to 1000...");

	}// end of main()

}// end of class
