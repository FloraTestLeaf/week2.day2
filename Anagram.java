package week2.day1.classroom;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1="stops";
		String text2="potss";
		int l1=text1.length();
		int l2=text2.length();
		if(l1==l2) {
			
			System.out.println("same");
		}
		
		char[] t1=text1.toCharArray();
		char[] t2=text2.toCharArray();
		System.out.println(t1);
		System.out.println(t2);
		
		Arrays.sort(t1);
		
		Arrays.sort(t2);
		if(Arrays.equals(t1,t2)) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
		
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */


	}

}
