package week1;

import java.util.Scanner;

/*
10. Перевести чило з десятичної системи в двійкову і навпаки. Користувач вводить число
 */
public class Exercise10 {
    public static void main(String[] args) {

        int number;
        int binaryNumber;
        int n = 1;
        int binary = 0;
        int choose;
        int number1;
        int decimal = 0;
        int decimalNumber;

        Scanner sc = new Scanner(System.in);


        System.out.println("                     M e n u");
        System.out.println("1 - translate from decimal number to binary number");
        System.out.println("2 - translate from binary number to decimal number");
        System.out.println("3 - exit");
        choose = sc.nextInt();

        switch (choose) {

            case 1:
                System.out.print("Please, enter decimal number - ");
                number = sc.nextInt();
                number1 = number;
                binaryNumber = 0;
                while (number > 0) {
                    binaryNumber = 0;
                    if (number % 2 == 1) {
                        binaryNumber = n;
                    }
                    binary = binary + binaryNumber;
                    n = n * 10;
                    number = number / 2;
                }
                System.out.println("decimal number - " + number1 + " is " + binary + " - binary number");
                break;

            case 2:
                System.out.print("Please, enter binary number - ");
                number = sc.nextInt();
                number1 = number;

                while (number > 0) {
                    decimalNumber = 0;
                    if (number % 10 == 1){
                        decimalNumber = n;
                    }
                    decimal = decimal + decimalNumber;
                    n = n * 2;
                    number = number / 10;

                }
                System.out.println("binary number - " + number1 + " is " + decimal + " - decimal number");
                break;


            case 3:
                break;
        }

    }
}
