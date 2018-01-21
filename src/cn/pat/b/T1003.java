package cn.pat.b;

import java.util.Scanner;

public class T1003 {

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in); int n = input.nextInt(); String[] s =
		 * new String[n]; for(int i = 0;i<n;i++) { s[i] = input.next(); } for(int i =
		 * 0;i<n;i++) { if(isTrue(s[i])) { System.out.println("YES"); }else {
		 * System.out.println("NO"); } } input.close();
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			boolean isOther = false;
			s[i] = new String(in.nextLine());
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) != 'P' && s[i].charAt(j) != 'A' && s[i].charAt(j) != 'T') {
					System.out.println("NO");
					isOther = true;
					break;
				}
			}
			if (isOther == false) {
				if (isTrue(s[i])) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		}
		in.close();
	}

	public static boolean isTrue(String str) {
		int p = str.indexOf('P');
		int t = str.indexOf('T');
		if (p > t) {
			return false;
		}

		String a = null;
		String b = null;
		String c = null;
		if (p != -1) {
			a = str.substring(0, p);
		} else {
			return false;
		}
		if (t != -1) {
			c = str.substring(t + 1, str.length());
		} else {
			return false;
		}
		b = str.substring(p + 1, t);

		if (a.contains("P") || a.contains("T") || b.contains("P") || b.contains("T") || c.contains("P")
				|| c.contains("T")) {
			return false;
		}
		if (c.length() < a.length()) {
			return false;
		}
		if (b.length() == 0) {
			return false;
		}
		if (a.equals(c) && a.equals("")) {
			return true;
		}
		int times = 0;
		for (int i = 0; i <= c.length() - a.length(); i += a.length()) {
			if (a.equals(c.substring(i, i + a.length()))) {
				times++;
			}
		}
		if (times == b.length()) {
			return true;
		} else {
			return false;
		}
		// // 判断是否包含PAT以及是否包含其他字符
		// if(!str.contains("P")||!str.contains("A")||!str.contains("T")) {
		// return false;
		// }
		// if(str.contains("P")&&str.contains("A")&&str.contains("T")) {
		// // 判断P和T的位置 indexOf判断的是第一个字符的位置
		// int pIndex = str.indexOf('P');
		// int tIndex = str.indexOf('T');
		// if (tIndex < pIndex) {
		// return false;
		// }
		// // 判断P和T的个数
		// int pCount = 0;
		// int tCount = 0;
		// for(int i = 0;i<str.length();i++) {
		// switch(str.charAt(i)) {
		// case 'P':
		// pCount++;
		// break;
		// case 'T':
		// tCount++;
		// break;
		// case 'A':
		// break;
		// default:
		// return false;
		// }
		// }
		// if(pCount>1||tCount>1) {
		// return false;
		// }
		// // 找到PT之间A的个数
		// int aMiddleCount = tIndex - pIndex - 1;
		// // 找到P之前的A的个数
		// int aBeforeCount = pIndex;
		// // 找到T之后的A的个数
		// int aAfterCount = str.length()-tIndex-1;
		// if(aBeforeCount*aMiddleCount!=aAfterCount) {
		// return false;
		// }
		// }
		// return true;
	}
}
