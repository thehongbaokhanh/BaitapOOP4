package baitap.OOP2;

import java.awt.*;
import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Menu");
        System.out.println("1. Draw the square");
        System.out.println("2. Draw the rectangle");
        System.out.println("3. Draw the isosceles triangle");
        System.out.println("4. Draw the top left triangle");
        System.out.println("5. Draw the top right triangle");
        System.out.println("6. Draw the bottom left triangle");
        System.out.println("7. Draw the bottom right triangle");
        System.out.println("8. exit");
        System.out.println("----------------------------------");
        System.out.println("please enter the choice: ");
        choice = scanner.nextInt();
        while (choice <= 0 || choice >= 9){
            System.out.println("----------------------------------");
            System.out.println("You can't choose this choice; please enter the choice again: ");
            choice = scanner.nextInt();
        };
        Draw(choice);
    }
    public static void Draw(int choice){
        int x,y,z;
        String draw = "";
        String space = " ";
        switch (choice){
            case 1:
                for ( x = 0; x < 3; x++){
                    for (y = 0; y < 3; y++){
                        draw += ".";
                    }
                    System.out.println(space + draw);
                    draw = "";
                }
                break;
            case 2:
                for ( x = 0; x < 3; x++){
                    for (y = 0; y <= 4; y++){
                        draw += ".";
                    }
                    System.out.println(space + draw);
                    draw = "";
                }
                break;
            case 3:
                for ( x = 0; x < 5; x++){
                    for (y = 0; y < x; y++ ){
                        draw += ".";
                    }
                    for (z = x ; z <= 5;z++){
                        space += " ";
                    }
                    System.out.println(space + draw + "." + draw);
                    space = " ";
                    draw = "";
                }
                break;
            case 4:
                for ( x = 5; x > 0; x--){
                    for (y = x; y > 0; y--){
                        draw += ".";
                    }
                    System.out.println(space + draw);
                    draw = "";
                }
                break;
            case 5:
                for ( x = 0; x < 5; x++){
                    for (y = 5; y > x; y--){
                        draw += ".";
                    }
                    for (z = 0; z < x; z++){
                        space += " ";
                    }
                    System.out.println(space + draw);
                    draw = "";
                    space = " ";
                }
                break;
            case 6:
                for ( x = 0; x < 5; x++){
                    for (y = 0; y <= x; y++){
                        draw += ".";
                    }
                    System.out.println(space + draw);
                    draw = "";
                }
                break;
            case 7:
                for ( x = 0; x < 5; x++){
                    for (y = 0; y <= x; y++){
                        draw += ".";
                    }
                    for (z = 5; z > x ; z--){
                        space += " ";
                    }
                    System.out.println(space + draw);
                    draw = "";
                    space = " ";
                }
                break;
            case 8:
                System.out.println("done! :)))))))");
                break;
        }
    }
}
