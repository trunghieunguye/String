import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        testSoThuanNghich();
    }

    public static void testSoThuanNghich() {
        System.out.println("Nhap so can check");
        int n = new Scanner(System.in).nextInt();
        StringBuilder xau = new StringBuilder();
        String str = "" + n;
        xau.append(str);
        String check = "" + xau.reverse();
        if (str.equals(check)) {
            System.out.println("La so thuan nghich");
        } else {
            System.out.println("Khong la so thuan nghich");
        }
    }
}



