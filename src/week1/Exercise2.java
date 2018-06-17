package week1;

import java.util.Scanner;



/*2. Користувач вводить три числа з консолі - потрібно вивести на консоль найбільше і найменше.*/

public class Exercise2 {
    public static void main(String[] args) {

        int maxNumber;
        int minNumber;
        int number;



        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter anything number - ");
        number = sc.nextInt();

        maxNumber = number;
        minNumber = number;

        System.out.print("Please, enter anything number - ");
        number = sc.nextInt();

        if (number > maxNumber){
            minNumber = maxNumber;
            maxNumber = number;
        }

        System.out.print("Please, enter anything number - ");
        number = sc.nextInt();

        if (number > maxNumber){
            maxNumber = number;
        } else if(number < minNumber){
            minNumber = number;
        }


        System.out.println("MaxNumber" + " " + maxNumber);
        System.out.println("MinNumber" + " " + minNumber);

    }
}
