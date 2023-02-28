import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Ten sau khi chuan hoa la " + normalize());
    }
    public static String normalize() {
        System.out.println("Nhap ten ");
        String input =new Scanner(System.in).nextLine();
        input = input.trim();
        String[] words = input.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1).toLowerCase());
                sb.append(" ");
            }
        }
        String normalizedName = sb.toString().trim();

        return normalizedName;
    }
}





