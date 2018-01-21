package cn.pat.b;

import java.util.Scanner;

public class T1001 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;
		while(n!=1) {
			switch(n%2) {
			case 0:
				n = n/2;
				break;
			case 1:
				n = (3*n+1)/2;
				break;
			}
			count++;
		}
		System.out.println(count);
		input.close();
	}
}
