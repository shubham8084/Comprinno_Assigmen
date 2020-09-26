package com.comprinno.assigment;

import java.util.Scanner;

public class TempleLand {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of strips you need to look::");
		int NumbeOfStrips = sc.nextInt();

		// cheacking constraint 1 ≤ NumbeOfStrips ≤ 100
		if (1 <= NumbeOfStrips && NumbeOfStrips <= 100) {
			// loop iteration according to NumbeOfStripss
			while (NumbeOfStrips != 0) {
				boolean condition =true;

				// Ni as number of parts into which Strips has been divided
                 int Ni=sc.nextInt();
				//cheacking constraint 3 ≤ Ni ≤ 100
                 if(3<=Ni && Ni<=100) {
                	
                	 // create a Array of size Ni
  					int StripArray[] = new int[Ni];
  					
 					// for loop using initilize the Array
 					for (int i = 0; i < Ni; i++) {
 						 /*takin input as Hi1, Hi2, .., HiNi These represent the heights of the
 	                	 various parts in the i-th strip.
 	                	 */
 						int Hi = sc.nextInt();
 						// insert the elements into Array
 						StripArray[i] = Hi;
 					} // end of for loop

 					//checkinhg Ni is even or not, if it is even then no center found
                	 if(Ni%2==0) {
                		 condition=false;
                	
                	 }//end of if
                	 
                	 //write logic to find prefect Strip or not
                	 else {
                		 //finding First and Last value of StripArray is 1 or not if not then Condition false
                		 if(StripArray[0]!=1 && StripArray[StripArray.length-1]!=1)
                			 condition=false;
                		
                		// finding center of Array
                		 int CenterOfArray=StripArray.length/2;
    
                		 /* heights should keep decreasing by exactly 1,
                		 when move from the centre part to the rightmost part*/
                		 
                		 for(int j=CenterOfArray;j<0;j--) {
          					//diff b/w two adject value must be 1 only
          					if(StripArray[j]-StripArray[j-1]!=1)
          					condition=false;
          					}//end of for loop
                		 
                		 
                		 /* heights should keep increasing by exactly 1,
                		 when move from the centre part to the leftmost part */
                		 
                		 for(int k=CenterOfArray;k<StripArray.length-1;k++) {
          					//diff b/w two adject value must be 1 only
          					if(StripArray[k]-StripArray[k+1]!=1)
          					condition=false;
          					}//end of for loop
                		
                	 }//end of else(contain main logic)
					

                 }//end ofif
                 else {
         			System.out.println("Invalid ! Ni must be b/w 3 to 100...");
         		} // else

                 if(condition==false)
                	 System.out.println("no");
                 else
                	 System.out.println("yes");
                 
                 
                 //decresse the NumberOfStrip by 1
				NumbeOfStrips--;
			} // end of while loop
		} // end of if

		else {
			System.out.println("Invalid ! Test cases must be b/w 1 to 100...");
		} // else

	}// end of main()

}// end of class
