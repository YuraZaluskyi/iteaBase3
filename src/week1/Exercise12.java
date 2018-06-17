package week1;

import java.util.Scanner;

/*
12. Вирахувати число фібоначі по номеру послідовності, який вводить користувач.
 */
public class Exercise12 {
    public static void main(String[] args) {

        int number;
        int f0 = 0;
        int f1 = 1;
        int f2 = f0 + f1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number - ");
        number = sc.nextInt();

        if (number == 0) {
            System.out.println("Number Fibonacci for n = " + number + "  " + "F = " + f0);
        } else if(number == 1){
            System.out.println("Number Fibonacci for n = " + number + "  " + "F = " + f1);
        } else {
            for (int i = 2; i <= number; i++) {
                f2 = f0 + f1;
                f0 = f1;
                f1 = f2;
            }
            System.out.println("Number Fibonacci for n = " + number + "  " + "F = " + f2);
        }

    }
}
