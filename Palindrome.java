package week2.day1.classroom;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String value="madam";
String rev="";
int l=value.length();
for (int i = l-1; i >=0; i--) {
	rev=rev+value.charAt(i);

}
System.out.println(rev);
if(rev.equals(value)) {
	System.out.println("It is a Palindrome");
}else {
	System.out.println("Its not a palindrome");
}

		
		
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
	}

}
