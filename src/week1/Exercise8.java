package week1;

import java.util.Scanner;

/*
8. Вводимо два числа. Порівняти останні цифри цих чисел (користуємося оператором %)
 */
public class Exercise8 {
    public static void main(String[] args) {

        int number1;
        int number2;
        String LastNumbers;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter number - ");
        number1 = sc.nextInt();

        System.out.print("Please, enter number - ");
        number2 = sc.nextInt();

        LastNumbers = number1 % 10 == number2 % 10 ? "Last numbers is even" : "Last numbers is not even";
        System.out.println(LastNumbers);


    }
}
