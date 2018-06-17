package week1;

import java.util.Scanner;

/*
 6. Вводимо два числа. Виводимо їх додаток, якшо він в діапазоні від 11 до 19.
 */
public class Exercise6 {
    public static void main(String[] args) {

        int number1;
        int number2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter number - ");
        number1 = sc.nextInt();
        System.out.print("Please, enter number - ");
        number2 = sc.nextInt();

        if (((number1 + number2) > 11) && ((number1 + number2) < 19)){
            System.out.println("Sum of numbers - " + (number1 + number2));
        } else {
            System.out.println("Sum of numbers is not between 11 and 19");
        }


    }
}
