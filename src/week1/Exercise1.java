package week1;

import java.util.Scanner;


/* 1. Користувач вводить цілочисельний тип з консолі (час від 0 до 24)
  Якшо час від 9 до 18 - вивлдимо на консль "I am at work", в іншому випадку "I rest"
*/
public class Exercise1 {
    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number - ");

        number = sc.nextInt();
        System.out.println();

        if (number > 9 && number <18){
            System.out.println("I am at work");
        } else if ((number >= 0 && number <=9)||(number>=18 && number <=24)){
            System.out.println("I rest");
        } else {
            System.out.println("You enter incorrect hour!");
        }


    }
}
