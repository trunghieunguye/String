import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Ket qua la " + xenKe());
    }

    public static String xenKe() {
        System.out.print("Nhap chuoi ki tu ");
        String input = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }

        }
        return sb.toString();
    }
}




