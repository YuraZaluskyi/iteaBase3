package week1;

import java.util.Scanner;


/* 3. Користувач вводить число. Вивести на екран його подвоєне значення, якшо число ділиться на 7 без залишку.*/
public class Exercise3 {

    public static void main(String[] args) {

        int number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter number - ");
        number = sc.nextInt();


        if (number%7 == 0){
            System.out.println("number * 2 = " + number*2);
        } else{
            System.out.println("number is not multiple 7");
        }

    }
}
