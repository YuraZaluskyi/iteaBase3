package week1;

import java.util.Scanner;

/*
  5. Вводимо 2 числа. Якшо перше число більше другого, то виводимо на консоль різницю цих чисел.
  В іншому випадку то виводимо добуток
 */
public class Exercise5 {
    public static void main(String[] args) {

        int number1;
        int number2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter number - ");
        number1 = sc.nextInt();

        System.out.print("Please, enter number - ");
        number2 = sc.nextInt();

        if (number1 > number2){
            System.out.println("Difference of two numbers - " + (number1 - number2));
        } else{
            System.out.println("Product of numbers - " +(number1*number2));
        }


    }
}
