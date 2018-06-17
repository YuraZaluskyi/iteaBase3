package week1;

import java.util.Scanner;

/*
13. Дано натуральне число А > 1. Вирахувати яким по рахунку числом Фібоначі воно являється.
  Тобто введіть так число n , щоб φn=A.Якшо А не являєтся числом Фібоначі, виведіть число -1.
 */
public class Exercise13 {
    public static void main(String[] args) {


        int number;
        int f0 = 0;
        int f1 = 1;
        int f2 = f0 + f1;
        int n = 2;
        int k = -1;



        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter number more than 1 - ");
        number = sc.nextInt();

        while (f2 <= number){
            f2 = f0 + f1;
            if (number == f2){
                System.out.println("Number - " + number + " is " + n + " number in oder Fibonacci");
                k = -k;
                break;
            }
            f0 = f1;
            f1 = f2;
            n = n+1;
        }
        if (k == -1){
            System.out.println("Number - " + number + " is not number in oder Fibonacci");
        }

    }
}
