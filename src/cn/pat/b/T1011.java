package cn.pat.b;

import java.util.Scanner;

public class T1011 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long[][] l = new long[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				l[i][j] = input.nextLong();
			}
		}
		for (int i = 0; i < n; i++) {
			boolean result = l[i][0] + l[i][1] > l[i][2];
			if (result) {
				System.out.println("Case #"+(i+1)+": "+true);
			} else {
				System.out.println("Case #"+(i+1)+": "+false);
			}
		}
	}
}
