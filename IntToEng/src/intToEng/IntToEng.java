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
	
	static final String[] TENS_PLACE = {"zero", "zero", "twenty", "thirty", "fourty",
			"fifty", "sixty", "seventy", "eighty", "ninety"};
	
	static String translateEng(int n) {
		StringBuilder sb = new StringBuilder();
		
		int thouPlace = n / 1000;
		int hundPlace = (n%1000) / 100;
		int tenPlace = (n%100) / 10;
		int onePlace = n % 10;
		
		if(thouPlace > 0) sb.append(ONES_PLACE[thouPlace] + " thousand ");
		
		if(hundPlace > 0) sb.append(ONES_PLACE[hundPlace] + " hundred ");
		
		if(tenPlace > 1) {
			int i = 2;
			while(i != tenPlace) {
				i++;
			}
			sb.append(TENS_PLACE[i] + " ");
		}
		
		if(tenPlace != 1) sb.append(ONES_PLACE[onePlace]);	
		else sb.append(TEEN[onePlace]);
		
		return new String(sb);		
	}
}
