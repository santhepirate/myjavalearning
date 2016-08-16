package simple;

import java.util.Scanner;

public class Firstprogram {

    private static int number1, number2, number3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number\n");
        number1 = input.nextInt();
        System.out.println("Enter the next number\n");
        number2 = input.nextInt();

        number3 = (number1 < 200)
                  && (number2 < 200) ? number1
                                       + number2 : 0;

        if (number3 == 0) {
            System.out.println("One of the entered number is greater than 200\n"
                               + number1 + "\n" + number2);

        } else {
            System.out.println("Sum of two number is \n"
                               + number3);
        }
    }
}
