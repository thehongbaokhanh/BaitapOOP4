package baitap.OOP1;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        SayHello(name);
    }
    public static void SayHello(String name){
        System.out.println("Hello; welcome back " + name + "! ");
    }

}
