import java.util.Arrays;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        System.out.print("Nhap cau khoang qua 20 tu, moi tu khong qua 10 ki tu nhe baby : ");
        String sentence = new Scanner(System.in).nextLine();
        String[] words = sentence.split("\\s+");
        Arrays.sort(words);
        System.out.println(" Ket qua day ne ");
        for (String word : words) {
            System.out.print(word + " ");
        }


        }
    }

