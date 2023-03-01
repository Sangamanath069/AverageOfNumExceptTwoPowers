package com.swayaandigitalsolutionspt.assignment;
import java.util.*;

class SolutionClass{
	static int[] arr;
	public static int[] createAnArray(Scanner sc) {
	 // Using Exception Handling......	
	  boolean b = true;
	  int k=1;
	  while(b == true) {
		  try {
			  if(k==1) {
				  System.out.println("Type \"YES\" to Start program");
			  }
			  k++;
			  sc.nextLine();
		  
		System.out.println("Please enter size of an array");
		
		
		int size = sc.nextInt();
		 arr = new int[size];
	
		for(int i=0; i<=arr.length-1; i++){
			System.out.println("Please enter "+i+" index position element:");
			arr[i] = sc.nextInt();
		}
		b = false;
		
		}
		catch (Exception e) {
			System.out.println();
			System.out.println("Please enter valid integer array element and size.!!");
			b = true;
			
		}
	  }
	  
		//return the array to the caller.
		return arr;
	  
		
	}
	
	public void findAvgOfNumExceptTwoPower(int[] arr) {
		
		ArrayList al = new ArrayList();
		
		for(int i=0; i<=arr.length-1; i++) {
			boolean b = true;
			int num = arr[i];
			//If element is "Zero" then I will not find or check 2's power.
			if(num != 0) {
				
		    // step 1. while loop for finding even numbers,
			// step 2. If even number is found then I will make my "b" value to "false".	
			// step 3. If "b" value is "false" then I will not add that element to my "ArrayList".	
			// step 4. if "b" value is "true" then I will add that element to My "ArrayList".
			
			while(num%2 == 0 ) {
				num = num/2;
				if(num==1) {
					b = false;
					break;//even power
				}
			}
			}
			// step 3 and 4 applied here.
			if(b) {
				al.add(arr[i]);
			}
			
		}
		System.out.println(al);
		int totalSum = 0;
		//Finding total sum of "ArrayList" elements
		for(Object x : al) {
			totalSum = totalSum + (int)x;
		}
		//System.out.println( "totalSum  --->	"+totalSum);
		// size of "ArrayList" which doesn't contains 2's power.
		int size = al.size();
		//System.out.println( "Size	  --->	"+size);
		
		int avgIs = (int)totalSum/size;
		System.out.println();
		
		//***Printing final output***
		System.out.println("Output");
		System.out.println(avgIs);
		
	}
	
	
	
}

public class AverageOfNumExceptTwoPowers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Calling or invoking createAnArray() method
		//"createAnArray()" method is static method so, no need to create object of class "SolutionClass".
		int arr[] = SolutionClass.createAnArray(sc);
		
		//calling a instance method findAvgOfNumExceptTwoPower(arr) by creating object of class "SolutionClass".
		new SolutionClass().findAvgOfNumExceptTwoPower(arr);
		
	}

}

