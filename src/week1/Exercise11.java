package week1;

import java.util.Scanner;

/*
11. Вирахувати факторіал числа, яке вводить користувач.
 */
public class Exercise11 {
    public static void main(String[] args) {
        int number;
        long factorial;
        factorial = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter number - ");
        number = sc.nextInt();
        if (number == 0){
            System.out.println("Factorial number - " + number +"! = " + factorial);
        } else{
            for (int i = 1; i <= number ; i++) {
                factorial = factorial*i;
            }

            System.out.println("Factorial number - " + number +"! = " + factorial);
        }

    }
}
