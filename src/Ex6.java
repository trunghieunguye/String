import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.print("Nhap s1 : ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Nhap s2 : ");
        String s2 = new Scanner(System.in).nextLine();
        int index = s1.indexOf(s2);
        while (index != -1) {
            s1 = s1.replace(s2, "");
            index = s1.indexOf(s2);
        }
        System.out.println("Ket qua sau khi thay the " + s1);


    }
}
