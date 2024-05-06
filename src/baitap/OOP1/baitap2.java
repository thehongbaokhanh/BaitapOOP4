package baitap.OOP1;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter how much money you want to exchange Usd to Vnd: ");
        double Usd = scanner.nextDouble();
        System.out.println("So Usd you got after exchange it: " + UsdToVnd(Usd));
    }
    public static double UsdToVnd(double Usd){
        double Vnd;
        return Vnd = Usd * 23000;
    }
}
