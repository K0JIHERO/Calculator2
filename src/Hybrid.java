import java.util.Scanner;

public class Hybrid {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Input: ");
        String userInput = s.nextLine();
        System.out.println(Answer(userInput));
    }

    public static int Answer(String input) {
        Scanner s = new Scanner(input);
        String operand1 = s.next();
        String operator = s.next();
        String operand2 = s.next();

        int a = Integer.parseInt(operand1);
        int b = Integer.parseInt(operand2);
        int answer = 0;
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            System.out.println("Задано неверное число!");
        } else {
            switch (operator) {
                case "+" -> answer = a + b;
                case "-" -> answer = a - b;
                case "/" -> answer = a / b;
                case "*" -> answer = a * b;
                default -> System.out.println("Задана неверная операция!");
            }
        }
        System.out.println("Output: ");
        return answer;

    }
}

