package ru.vsu.cs.dolzhenkoms;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int n = readNumber();
        int m = readNumber();
        int countGroups = getCountGroups(n,m);

        printCountGroups(n, m, countGroups);
    }

    private static int readNumber() {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        return num;
    }
    private static int getCountGroups(int N, int M) {
        int countGroups = 0;

        while(N > 0 && M > 0){
            N--; M--;
            if(N > 0  || M > 0){
                if(N >= M){
                    N--;
                }
                else{
                    M--;
                }
                countGroups++;
            }
        }

        return countGroups;
    }
    private static void printCountGroups(int n, int m, int countGroups) {
        if(n < 0 || m < 0) {
            System.out.println("Wrong number of boys or girls.");
        }
        else {
            System.out.printf("You can make %d groups from %d boys and %d girls", countGroups, n, m);
        }
    }
}
