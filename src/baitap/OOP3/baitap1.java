package baitap.OOP3;

import java.util.Arrays;
import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your array length you think: ");
        int length = scanner.nextInt();
        int[] array1;
        array1 = AddArray(length);
        System.out.println("So your array you got it: ");
        System.out.println(Arrays.toString(array1));
        System.out.println("Please enter your number, you want to delete from your array:");
        int numberdelete = scanner.nextInt();
        DeleteArray(length, numberdelete, array1);
    }
    public static int[] AddArray(int length){
        int[] array1 = new int[length];
        for (int x = 0; x < length; x++){
            System.out.println("Please enter the number " + (x+1) +" of your array:");
            int infor = new Scanner(System.in).nextInt();
            array1[x] = infor;
        }
        return array1;
    }
    public static void DeleteArray(int lenght, int numberdelete, int array1[]){
        int x,y;
        int[] array2 = new int[lenght - 1];
        for (x= 0, y = 0; x < lenght; x++ ){
            if (array1[x] != numberdelete){
                array2[y] = array1[x];
                y++;
            }
        }
        System.out.println("So your array after delete is: ");
        System.out.println(Arrays.toString(array2));

    }

}
