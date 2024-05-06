import java.util.Scanner;

public class baiaptinhsodien {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        System.out.println(tinhTienDien(100));
        System.out.println(tinhTienDien(1000));
    }
    public static double tinhTienDien(double soDien){
        double result = 0;
        if (soDien >400){
            result += ((soDien - 400) * 2.701);
            soDien = 400;
        }
        if (soDien <= 400 && soDien > 300){
            result += ((soDien - 300) * 2.615);
            soDien = 300;
        }
        if (soDien <= 300 && soDien > 200){
            result += ((soDien - 200) * 2.340);
            soDien = 200;
        }
        if (soDien <= 200 && soDien > 100){
            result += ((soDien - 100) * 1.858);
            soDien = 100;
        }
        if (soDien <= 100 && soDien > 51){
            result += ((soDien - 50) * 1.600);
            soDien = 50;
        }
        if (soDien <= 50 && soDien > 0){
            result += soDien * 1.549;
            soDien = 0;
        }
        return result;
    }
}
