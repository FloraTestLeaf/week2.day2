package week2.day1.classroom;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Check number of occurrences of a char (eg 'e') in a String
		
		String str = "welcome to chennai";
		

		// declare and initialize a variable count to store the number of occurrences
		int count = 0;
		
		char find='e';
		
		// convert the string into char array
		//char[] charAr=str.toCharArray();
		
			
		//get the length of the array
		int l=str.length();
		System.out.println(l);
		// traverse from 0 till the array length 
			for (int i = 0; i < l-1; i++) {
				if(str.charAt(i)==find) {
					count++;
				}
				
			}
			
			System.out.println(count);
			
			
			// Check the char array has the particular char in it 
		
			// if is has increment the count
				 
			
			// print the count out of the loop
	}

}
