import java.util.Scanner;

public class thuchanh2 {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        System.out.println("Hãy số phần tử trong mảng mà bạn muốn nhập vào đây: ");
        int numbersarray = infor.nextInt();
        int[] array = new int[numbersarray];
        for (int x = 0; x < array.length; x++){
            System.out.println("Hãy nhập số hạng thứ " + (x+1) + " vào đây: ");
            array[x] = infor.nextInt();
        }
        System.out.println("Vậy số hạng nhỏ nhất trong mảng là: " + min(array));
    }
    public static int min(int[] a) {
        int min = a[0];
        for ( int i = 0; i < a.length; i++){
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}
