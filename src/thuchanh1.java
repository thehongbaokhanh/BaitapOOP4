
import java.util.Scanner;

public class thuchanh1 {
    public static double celsiousToFahrenheit (double celsious){
        double fahrenheit = (9.0 / 5) * (celsious + 32);
        return fahrenheit;
    }
    public static double FahrenheitTocelsious (double fahrenheit){
        double celsious  =  (5.0 / 9) * (fahrenheit - 32);
        return celsious;
    }
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        System.out.println("Menu:");
        System.out.println("------------------------");
        System.out.println("1. Chuyển từ độ F sang độ C ");
        System.out.println("2. Chuyển từ độ C sang độ F ");
        System.out.println("Hãy nhập lựa chọn của bạn xuống đây:");
        int choice = infor.nextInt();
        while (choice < 1 || choice >= 3){
            System.out.println("Không có lựa chọn " + choice + " vui lòng nhập lại.");
            System.out.println("------------------------");
            System.out.println("1. Chuyển từ độ F sang độ C ");
            System.out.println("2. Chuyển từ độ C sang độ F ");
            System.out.println("Hãy nhập lựa chọn của bạn xuống đây:");
            choice = new Scanner(System.in).nextInt();
        }
        if (choice == 1){
            System.out.println("Hãy nhập số độ F mà bạn muốn đổi: ");
            fahrenheit = infor.nextDouble();
            System.out.println("Vậy số độ C sau khi được thay đổi là: " + FahrenheitTocelsious(fahrenheit));
        }
        if (choice == 2){
            System.out.println("Hãy nhập số độ F mà bạn muốn đổi: ");
            celsius = infor.nextInt();
            System.out.println("Vậy số độ C sau khi được thay đổi là: " + celsiousToFahrenheit(celsius));
        }

    }
}
