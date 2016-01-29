package test;

import java.util.Scanner;

public class power { //with loop
	public static void main(String[] args) {
		int N = 0;
		Scanner stdin = new Scanner(System.in);
		N = stdin.nextInt();
		boolean result = isPowerOfThree(N);
		stdin.close();
		System.out.println(result);
	}
	public static boolean isPowerOfThree(int n) {
		if (n == 0) {
			return false;
		} else {
			while (n % 3 == 0) {
			    n /= 3;
			}
			return n == 1;
		}
		
	}
}
