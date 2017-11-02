
package test;

import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Put a text: ");
		
		Scanner inp = new Scanner(System.in);
		String num = inp.nextLine();
		
		System.out.println("This is consists of " +Counter(num) + "words");
		
	}
	
	public static int Counter(String text) {
		
		int count=1;
		
		for (int i=0;i < text.length();i++) {
			
			if(text.charAt(i)==' ') {
				count++;
			}
			
			
		}
		
		return count;
	}
	
	

}
