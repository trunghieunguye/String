import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {

        System.out.print("Nhap ho ten : ");
        String fullName = new Scanner(System.in).nextLine();
        String[] words = fullName.split(" ");
        String firstName = words[words.length - 1];
        String lastName = words[0];
        String middleName = "";
        for (int i = 1; i < words.length - 1; i++) {
            middleName += words[i] + " ";
        }
        middleName = middleName.trim();

        String newFullName = firstName + " " + lastName + " " + middleName;
        System.out.println(" Ho ten moi: " + newFullName);
    }
}





