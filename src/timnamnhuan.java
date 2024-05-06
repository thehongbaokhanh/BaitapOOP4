import java.util.Scanner;

public class timnamnhuan {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = infor.nextInt();
        System.out.println("If you don't want to enter the max year choose 0 if you want to enter enter the max year in under:");
        int maxyear = infor.nextInt();
        if (maxyear == 0){
            if (kiemTraNamNhuan(year) == true){
                System.out.println( year + " is the leap year");
            }else {
                System.out.println( year + " isn't a leap year");
            }
        }else {
            System.out.println("All leap years we can get in " + year + " to " + maxyear +": " +timNamNhuan(year, maxyear));
        }

    }
    public static boolean kiemTraNamNhuan(int year){
        boolean result = false;
        if (year % 4 == 0){
            result = true;
        }
        return result;
    }
    public static String timNamNhuan(int year, int maxyear){
        String result = "";
        for (int x = year; x < maxyear; x++){
            if (kiemTraNamNhuan(x) == true){
                result =result + x + ";";
            }
        }

        return result;
    }
}
