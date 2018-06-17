package week1;

import java.util.Scanner;

/*
 7. Вводимо два числа, якшо одне з них ділить без залишку на інше, то виводимо true і показуємо результат ділення.
 */
public class Exercise7 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int maxNumber;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter number - ");
        number1 = sc.nextInt();
        System.out.print("Please, enter number - ");
        number2 = sc.nextInt();

        maxNumber = number1;

        if (number2 > maxNumber){
            maxNumber = number2;
            number2 = number1;
        }

        boolean isdivisible = maxNumber % number2 == 0 ? true : false;
        System.out.println(maxNumber/number2);
        System.out.println(isdivisible);

    }
}
