package Calculator.Model;

import java.util.Scanner;

public class CalcView {
    Scanner scan = new Scanner(System.in);

    public String inputNumber(NumberDTO number) {
        System.out.print("두 수와 연산자를 입력하세요.(ex: 6 7 +):");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        String op = scan.next();

        number.setNum1(num1);
        number.setNum2(num2);

        return op;
    }

    public void printResult(NumberDTO number, String op) {
        double result = number.getResult();
        System.out.printf("두 수 %d와 %d의 ", number.getNum1(), number.getNum2());
        switch (op) {
            case "+":
                System.out.printf("%s의 합은 %.2f입니다.%n", op, result);
                break;
            case "-":
                System.out.printf("%s의 차는 %.2f입니다.%n", op, result);
                break;
            case "*":
                System.out.printf("%s의 곱은 %.2f입니다.%n", op, result);
                break;
            case "/":
                if (number.getNum2() != 0) {
                    System.out.printf("%s의 몫은 %.2f입니다.%n", op, result);
                } else {
                    System.out.println("0으로 나눌 수 없습니다");
                }
                break;
            default:
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        }
    }
}
