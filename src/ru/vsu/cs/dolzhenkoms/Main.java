package ru.vsu.cs.dolzhenkoms;

public class Main {

    public static void main(String[] args) {
        System.out.println(getCountGroups(9,7)); // 5
        System.out.println(getCountGroups(2,1)); // 1
        System.out.println(getCountGroups(30,0)); // 0
        System.out.println(getCountGroups(20,15)); // 11
        System.out.println(getCountGroups(45, 10)); // 10
    }

    private static int getCountGroups(int N, int M) {
        int countGroups = 0;

        while(N > 0 && M > 0)
        {
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
}
