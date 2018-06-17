package week1;

import java.util.Scanner;

/* 4. Вводимо число з плаваючою точкою і перевіряємо чи це число в діапазоні від 0 до 1.*/
public class Exercise4 {

    public static void main(String[] args) {
        System.out.print("Please, enter number - ");
        Scanner sc = new Scanner(System.in);
        double number;
        number = sc.nextDouble();
        if (number >= 0 && number <= 1){
            System.out.println("The number is between 0 and 1");
        } else{
            System.out.println("The number is not between 0 and 1");
        }
    }
}
