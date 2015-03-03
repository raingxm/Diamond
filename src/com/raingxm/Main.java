package com.raingxm;

public class Main {

    public static void printIsoscelesTriangle(int n) {
        for(int i=1; i<=n; i++) {
            printSpace(n-i);
            printAsterisk(2*i - 1);
            printSpace(n-i);
            System.out.println();
        }
    }

    public static void printDiamond(int n) {
        printIsoscelesTriangle(n);
        printReverseTriangle(n-1, 1);
    }

    private static void printReverseTriangle(int n, int space) {
        for(int i=0; i<n; i++) {
            printSpace(i+space);
            printAsterisk(2*n -2*i - 1);
            printSpace(i);
            System.out.println();
        }
    }

    private static void printAsterisk(int n) {
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
    }

    private static void printSpace(int n) {
        for(int i=0; i<n; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        //printIsoscelesTriangle(3);
        printDiamond(3);
    }
}
