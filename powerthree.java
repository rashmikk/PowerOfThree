package test;

import java.util.Scanner;

public class powerthree { //without loop

	public static void main(String[] args) {
		int N = 0;
		Scanner stdin = new Scanner(System.in);
		N = stdin.nextInt();
		boolean result = isPowerOfThree(N);
		stdin.close();
		System.out.println(result);
	}
	public static boolean isPowerOfThree(int n) {
		  double a = Math.log(n) / Math.log(3);
		  return Math.abs(a - Math.rint(a)) <= 0.00000000000001;
	}

}
