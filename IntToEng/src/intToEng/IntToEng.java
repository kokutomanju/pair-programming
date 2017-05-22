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
		
		int hundThouPlace = n / 100000;
		int tenThouPlace = (n%100000) / 10000;
		int thouPlace = (n%10000) / 1000;
		int hundPlace = (n%1000) / 100;
		int tenPlace = (n%100) / 10;
		int onePlace = n % 10;
		
		if(n == 0) {
			sb.append(ONES_PLACE[n]);
		} else {
			if(n >= 10000) {
				translateTenPlace(sb, hundThouPlace, tenThouPlace, thouPlace);
				sb.append(" thousand ");
			} else {
				if(thouPlace > 0) sb.append(ONES_PLACE[thouPlace] + " thousand ");
				if(n % 1000 == 0) {
					sb.deleteCharAt(sb.length()-1);
					return new String(sb);
				}
			}
			
			translateTenPlace(sb, hundPlace, tenPlace, onePlace);
			if(n == 0) sb.append(ONES_PLACE[n]);
		}
		
		return new String(sb);		
	}

	private static void translateTenPlace(StringBuilder sb, int hundPlace,   int tenPlace, int onePlace) {
		if(hundPlace > 0) sb.append(ONES_PLACE[hundPlace] + " hundred ");
		
		if(tenPlace == 0 && onePlace == 0) {
			sb.deleteCharAt(sb.length()-1);
		} else {
		
			if(tenPlace > 1) {
				int i = 2;
				while(i != tenPlace) {
					i++;
				}
				sb.append(TENS_PLACE[i] + " ");
			} else if(tenPlace == 1) {
				sb.append(TEEN[onePlace]);
			}
			
			if(tenPlace != 1) {
				sb.append(ONES_PLACE[onePlace]);
			}
		}
	}
}
