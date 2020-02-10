package net.mytrofanov.exception;

import java.util.Scanner;

public class SimpleException {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        System.out.println(easyAskForgivenessPermission(x, y));
        System.out.println(lookBeforeYouLeap(x, y));
        System.out.println(getIntLBYL());
    }

    public static int getIntLBYL() {
        System.out.println("Please input the digit");
        boolean isValid = true;
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    public static int lookBeforeYouLeap(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int easyAskForgivenessPermission(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}