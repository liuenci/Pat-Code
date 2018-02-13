package cn.pat.b;

import java.util.Scanner;

public class T1002 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n = input.next();
		input.close();
		int sum = 0;
		for(int i = 0;i<n.length();i++) {
			String a = String.valueOf(n.charAt(i));
			int b = Integer.parseInt(a);
			sum+=b;
		}
		String strSum = String.valueOf(sum);
		StringBuffer strBuffer = new StringBuffer();
		for(int i = 0;i<strSum.length();i++) {
			switch(strSum.charAt(i)) {
			case '0':
				strBuffer.append("ling ");
				break;
			case '1':
				strBuffer.append("yi ");
				break;
			case '2':
				strBuffer.append("er ");
				break;
			case '3':
				strBuffer.append("san ");
				break;
			case '4':
				strBuffer.append("si ");
				break;
			case '5':
				strBuffer.append("wu ");
				break;
			case '6':
				strBuffer.append("liu ");
				break;
			case '7':
				strBuffer.append("qi ");
				break;
			case '8':
				strBuffer.append("ba ");
				break;
			case '9':
				strBuffer.append("jiu ");
				break;
			}
		}
		System.out.println(strBuffer.substring(0, strBuffer.length()-1));
	}
}
