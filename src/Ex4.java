import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.print("Nhap xau ki tu ");
        String str = new Scanner(System.in).nextLine();
        String[] words = str.split("\\s+");
        String longestWord = "";
        int longestWordIndex = -1;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > longestWord.length()) {
                longestWord = word;
                longestWordIndex = i;
            }
        }
        System.out.println("Tu dai nhat: " + longestWord);
        System.out.println("Vi tri cua tu : " + (longestWordIndex + 1));
    }

}
