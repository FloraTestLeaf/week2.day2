package week2.day1.classroom;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="Iam a software Tester";
		String[] words=test.split(" ");
		for (int i = 0; i < words.length; i++) {
			if(i%2==1) {
				for (int j = words[i].length()-1; j >=0; j--) {
					System.out.print(words[i].charAt(j));
				}
				System.out.println(" ");
			}else {
				System.out.println(words[i] +" ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		//"" if u give all letters including space will be printed
		//" " words will be printed
		//"Iam" rest all will be printed
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		

		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	*/
	}

}
