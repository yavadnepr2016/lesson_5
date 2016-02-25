package com.company;

public class Main {

    public static void main(String[] args) {
        int countb = 5;
        int counta = 5;
        char[][] b = new char[counta][countb];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (i > j) {
                    b[i][j] = ' ';
                }
                if (i <= j) {
                    b[i][j] = '*';
                }

                System.out.print(b[i][j]);
            }
            System.out.println();
        }

        {
            int counta = 5;
            char[][] b = new char[counta][];
            b[0] = new char[5];
            b[1] = new char[4];
            b[2] = new char[3];
            b[3] = new char[2];
            b[4] = new char[1];
            for (int i = b.length - 1; i >= 0; i--) {
                for (int j = b[i].length - 1; j >= 0; j--) {
                    b[i][j] = '*';
                    System.out.print(b[i][j]);
                }
                System.out.println();
            }
        }

        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{1, 2}, {3, 4}, {5, 6}};
        int[][] c = new int[a.length][a.length];
        {
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    int summ = 0;
                    for (int ii = 0; ii < a[i].length; ii++) {
                        summ = summ + (a[i][ii] * b[ii][j]);
                    }
                    c[i][j] = summ;
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }

        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}};
        int[][] c = new int[2][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length + 1; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }


    }
}