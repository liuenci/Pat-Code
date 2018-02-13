package cn.pat.b;

import java.util.Scanner;

public class T1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[] num = new int[m];
        for (int i = 0; i < m; i++) {
            num[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int rear = num[m - 1];
            for (int j = m - 1; j > 0; j--) {
                num[j] = num[j - 1];
            }
            num[0] = rear;
        }

        for (int i = 0; i < m; i++) {
            System.out.print(num[i]);
            if (i != m - 1) {
                System.out.print(" ");
            }
        }
    }
}
