package week2.day1.classroom;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;
				
				char[] charArr=test.toCharArray();
				for (int i = 0; i < charArr.length; i++) {
					if(Character.isLetter(charArr[i])) {
						letter++;
						
					}else if(Character.isDigit(charArr[i])) {
						num++;
						
					}else if(Character.isSpaceChar(charArr[i])) {
						space++;
						
					}else {
						specialChar++;
						
					}
					
					
				}
				
				System.out.println(letter +" Its letter");
				System.out.println(num +" its a digit");
				System.out.println(space +" its space");
				System.out.println(specialChar +" spl char");
				// Build the logic to find the count of each
				/* Pseudo Code:
					a) Convert the String to character array
					b) Traverse through each character (using loop)
					c) Find if the given character is what type using (if)
							i)  Character.isLetter
							ii) Character.isDigit
							iii)Character.isSpaceChar
							iv) else -> consider as special character
				*/

				// Print the count here
	}

}
