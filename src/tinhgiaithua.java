import java.util.Scanner;

public class tinhgiaithua {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        int giaithua = infor.nextInt();
        System.out.println(giaithua);
    }
    public static int giaiThua(int a){
        int result = 1;
        if (a == 0){
            result = 1;
        }else {
         for (int x = 1 ; x <= a; a++){
             result = result * a * (a - x);
         }
        }
        return result;
    }
}
