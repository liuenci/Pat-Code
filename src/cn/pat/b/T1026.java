package cn.pat.b;

import java.util.Scanner;

public class T1026 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int ans = b - a;
		if (ans % 100 >= 50) {
			ans = ans / 100 + 1;
		} else {
			ans = ans / 100;
		}
		System.out.printf("%02d:%02d:%02d\n",ans/3600,ans%3600/60,ans%60);
		input.close();
	}
}
