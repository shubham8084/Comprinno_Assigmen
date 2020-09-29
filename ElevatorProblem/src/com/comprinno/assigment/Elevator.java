package com.comprinno.assigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Elevator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int TestCase = sc.nextInt();
		// loop reapts number of time testcases are there
		while (TestCase > 0) {
			// take a input N which denotes the size of an sequence
			int N = sc.nextInt();
			// taake a input M which denotes the floors size
			int M = sc.nextInt();
			// let take inital value 1 which means elevator is at first floor
			int initialVal = 1;
			// A boolean value wich indicates wich out will be printed or not
			boolean NotPrint = false;
			/*taking a boolean varible which show the dirction which mean if dirction is upward that 
			its value true and direction is downwards than its value becomes false*/
			boolean UpDirection = true;
			// a conut varible which store the number direction changed initally its zero
			int count = 0;
			// taking a for loop which reapts the loop according to N value means size of
			// Sequence B
			for (int i = 0; i < N; i++) {
				// taking a input value of sequence one by one
				int val = sc.nextInt();
				// comparing is previous value equals to next value if yes than print -1
				if (val == initialVal) {
					System.out.println("-1");
					// if we found seq is invalid than no need to printing other things so
					NotPrint = true;
				} // if
				else {
					// if the given value is -1 its means error value than we have to find the
					// posible value
					if (val == -1) {
						// if -1 is not there on firts position
						if (i > 0) {
							// stores the direction in a temp varible
							boolean tempDirection = UpDirection;
							// if directon is upward true than Add the value with 1
							if (UpDirection)
								val = initialVal + 1;
							else
								// if directon is downwards than subsract the value with 1
								val = initialVal - 1;
							/*checking last value and gien value is equal or not if equals than 
							assign tha direction as false*/
							if (val == M)
								UpDirection = false;
							// calculating the changed direction count
							if (tempDirection != UpDirection && i != N - 1)
								count++;

						} // if
							// if -1 is there on firts position
						else
							// assign the value with 1
							val = 1;

					} // if

					//
					// value other than -1 is there
					else {
						// stored the direction in temp varible
						boolean tempDirection = UpDirection;
						// cheking direction
						if (initialVal > val)
							// found direction downward so false
							UpDirection = false;

						else
							// found dirction upward so true
							UpDirection = true;
						// if both direction are not same than count value will incresed by 1
						if (UpDirection != tempDirection)
							count++;

					} // else

				} // end of else
					// assign current value in previous value and reapts the loop
				initialVal = val;
			} // for loop
				// if NotPrint false than only print the total changed direction
			if (!NotPrint)
				System.out.println(count);
			TestCase--;
		} // while loop

	}// main

}// class
