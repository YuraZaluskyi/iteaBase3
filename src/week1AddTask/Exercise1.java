package week1AddTask;

import java.util.Scanner;

/*
    1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и определить, является ли он прямоугольным.
    Ответ вывести в виде сообщения.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int a, b, c;
        int max;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter sides of the triangle");

        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("c = ");
        c = sc.nextInt();
//
//        
        max = a > b ? a > c ? a : c : b > c ? b : c; //визначаємо максимальне з трьох чисел


        System.out.println(max);


    }
}
