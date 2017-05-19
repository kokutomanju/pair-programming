package intToEng;

import java.util.Scanner;

public class IntToEng {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(translateEng(input));
	}
	
	static final String[] ONES_PLACE = {"zero", "one", "two", "three", "four",
			"five", "six", "seven", "eight", "nine"};
	
	static final String[] TEEN = {"ten", "eleven", "twelve", "thirteen", "fourteen",
			"fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	
	//static final Stinrg[] TENS_PLACE = {"", "", "twenty", "thirty" };
	
	static String translateEng(int n) {		
		return ONES_PLACE[n];		
	}

}
