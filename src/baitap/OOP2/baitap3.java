package baitap.OOP2;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 100;
        System.out.print("Please enter a number to find a prime number from 1 to 100: ");
            CheckAndShow(number);
    }
    public static void CheckAndShow(int number){
        for (int x = 3; x <= number; x++){
            if (checkPrime(x) == true){
                System.out.print(x + ", ");
            }
        }
    }
    public static boolean checkPrime(int number){
        boolean check = true;
        int count = 0;
        for (int x = 1; x <= number; x++){
            if (number % x == 0){
                count++;
            }
        }
        if (count > 2){
            check = false;
        }

        return check;
    }
}
