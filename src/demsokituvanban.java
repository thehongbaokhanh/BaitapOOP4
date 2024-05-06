//import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class demsokituvanban {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        System.out.println("Hãy điền văn bản bạn muốn tìm: ");
        String vanban = infor.next();
        System.out.println("Hãy tìm chữ mà bạn muốn đếm: ");
        char chu = infor.next().charAt(0);
        System.out.println("Như vậy số chữ mà bạn dùng để nhập là: " + demSoKiTu(vanban, chu));
    }
    public static int demSoKiTu(String a, char b){
        int count = 0;
        for (int x = 0; x < a.length(); x++ ){
            if (b == a.charAt(x)){
                count++;
            }
        }
        return count;
    }
}
