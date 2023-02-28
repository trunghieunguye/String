import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.print("Nhap s1 : ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhap s2 : ");
        String s2 = new Scanner(System.in).nextLine();
        int index = s1.indexOf(s2);
        if (index == -1) {
            System.out.println("Khong tim thay s2 trong s1");

        } else {
            System.out.println("Co tim thay s2 trong s1 va o vi tri thu " + index);

        }

    }
}
