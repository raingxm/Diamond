package com.raingxm;

public class Main {

    public static void printDiamond(int n) {
        for(int i=1; i<=n; i++) {
            printSpace(n-i);
            printAsterisk(2*i - 1);
            printSpace(n-i);
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
        printDiamond(3);
    }
}
