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
        int num1 = Integer.parseInt(operand1);
        int num2 = Integer.parseInt(operand2);
        int answer = 0;
        if (num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10) {
            if (operator.equals("+")) {
                answer = num1 + num2;
            } else if (operator.equals("-")) {
                answer = num1 - num2;
            } else if (operator.equals("/")) {
                answer = num1 / num2;
            } else if (operator.equals("*")) {
                answer = num1 * num2;
            } else {
                System.out.println("Задана неверная операция!");
            }
        }

        else {
            System.out.println("Задано неверное число!");
        }
        System.out.println("Output: ");
        return answer;

    }
}

