package week1;

import java.util.Scanner;

/*
9. Порахувати скільки разів зустрічається 5 в заданому числі, яке вводить користувач
 */
public class Exercise9 {
    public static void main(String[] args) {

        int number;
        int numberForAnswer;
        int n = 0;


        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter number - ");
        number = sc.nextInt();
        numberForAnswer = number;

        while (number != 0) {
            if (number % 10 == 5) {
                n = n + 1;
            }
            number = number / 10;

        }
        System.out.println("Quantity 5 in number " + numberForAnswer + " is " + n);
    }
}
