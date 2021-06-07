package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        number = input.nextInt();

        int n = 2;
        for(;n<100;n++){
            if(isPrime(n)){
                System.out.println(n + " ");
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int check = (int) Math.sqrt(n);
        for (int i = 2; i <= check; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
