import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        System.out.print("Nhap s1 : ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhap s2 : ");
        String s2 = new Scanner(System.in).nextLine();
        System.out.print("Nhap vi tri k : ");
        int k = new Scanner(System.in).nextInt();
        String s2Delete1 = s2.substring(0,k);
        String s2Delete2 = s2.substring(k);
        System.out.println(" Ket qua sau khi cat va ghep la " + s2Delete1 + s1 + s2Delete2);


    }
}
