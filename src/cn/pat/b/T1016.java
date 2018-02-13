package cn.pat.b;

import java.util.Scanner;

public class T1016 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String da = input.next();
		String b = input.next();
		String db = input.next();
		String pa = "";
		String pb = "";
		for (int i = 0; i < a.length(); i++) {
			char aStr = a.charAt(i);
			if(da.equals(String.valueOf(aStr))) {
				pa+=da;
			}
		}
		for (int i = 0; i < b.length(); i++) {
			char bStr = b.charAt(i);
			if(db.equals(String.valueOf(bStr))) {
				pb+=db;
			}
		}
		int paResult = pa.equals("")?0:Integer.parseInt(pa);
		int pbResult = pb.equals("")?0:Integer.parseInt(pb);
		System.out.println(paResult+pbResult);
	}

}
