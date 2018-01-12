package scanner;

import java.util.Scanner;

public class Application {

    static class NumberUtil {
        boolean isEven(int i) {
            return i % 2 == 0;
        }
    }

    public static void main(String args[]) {
        NumberUtil numberUtil = new NumberUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = scanner.nextInt();
        String result = (numberUtil.isEven(number)) ? "even" : "odd";
        System.out.printf("%d is an %s number", number, result);
    }
}
