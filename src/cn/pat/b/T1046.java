package cn.pat.b;

import java.util.Scanner;

public class T1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] num = new int[n][4];
        int failA = 0;
        int failB = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            if (num[i][1] == num[i][0] + num[i][2] && num[i][3] != num[i][0] + num[i][2]) {
                failB++;
            } else if (num[i][1] != num[i][0] + num[i][2] && num[i][3] == num[i][0] + num[i][2]) {
                failA++;
            }
        }
        System.out.println(failA+" "+failB);
    }
}
