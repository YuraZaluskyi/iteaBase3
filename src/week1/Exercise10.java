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

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter number - ");

        number = sc.nextInt();
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
        System.out.println(binary);
    }
}
