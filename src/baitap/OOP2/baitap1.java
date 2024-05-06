package baitap.OOP2;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number to find a prime number from 1 to: ");
        int number = scanner.nextInt();
        if (number == 2){
            System.out.println("From 1 to 2 don't have any prime number.");
        }
        else {
            System.out.print("The Prime number that app can find from 1 to " + number + " it: ");
            CheckAndShow(number);
        }
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
