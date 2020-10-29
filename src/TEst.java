import java.util.Scanner;

public class TEst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        int a = Integer.parseInt(userInput);
        String q = RomanNumeral.arabicToRoman(a);
        System.out.println(q);
    }
}