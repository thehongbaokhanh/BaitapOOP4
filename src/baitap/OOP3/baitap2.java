package baitap.OOP3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of your first array: ");
        int length1 = scanner.nextInt();
        int[] array1 = new int[length1];
        array1 = AddArray(length1);
        System.out.println("So that we got the array1: ");
        CallArray(array1);
        System.out.println("Please enter the length of your second array: ");
        int length2 = scanner.nextInt();
        int[] array2 = new int[length2];
        array2 = AddArray(length2);
        System.out.println("So that we got the array2: ");
        CallArray(array2);
        System.out.print("So your array after you plus array1 with array2 it's:");
        int length3 = length1 + length2;
        PlusArray(array1, array2, length3, length1, length2);
    }
    public static int[] AddArray(int length){
        int x;
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);
        for (x = 0; x < length; x++){
            System.out.print("enter your number " + (x + 1) + " of your array:");
            array[x] = new Scanner(System.in).nextInt();
        }
        return array;

    }
    public static void CallArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
    public static void PlusArray(int[] array1 , int[] array2, int length,int length1, int length2){
        int[] array = new int[length];
        int x,y;
        for (x = 0 , y = 0; x < length1 || y < length2;){
            if (x >= 0 && x < length1){
                array[x] = array1[x];
                x++;
            }
            if (x >= length1){
                array[x] = array2[y];
                y++;
            }
        }
        CallArray(array);
    }
}
