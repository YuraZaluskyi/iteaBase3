package week2.homework;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            ArrayWrapper.add(i);
        }

        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println(ArrayWrapper.getArr().length);
        System.out.println();


        // 1. return index
        System.out.println("Exercise 1");
        System.out.println(ArrayWrapper.get(15));
        System.out.println();

        // 2. copy of sorted array
        System.out.println("Exercise 2");
        System.out.println(Arrays.toString(ArrayWrapper.sort()));
        System.out.println();

        // 3. remove by index
        System.out.println("Exercise 3");
        ArrayWrapper.remove(13);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();

        // 4. remove by value
        System.out.println("Exercise 4");
        ArrayWrapper.removeByValue(10);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();

        // 5. search by value
        System.out.println("Exercise 5");
        System.out.println(ArrayWrapper.search(50));
        System.out.println();

        // 6. returns revers of array
        System.out.println("Exercise 6");
        System.out.println(Arrays.toString(ArrayWrapper.revers()));
        System.out.println();

        // 7. returns sub array
        System.out.println("Exercise 7");
        System.out.println(Arrays.toString(ArrayWrapper.revers()));
        System.out.println(Arrays.toString(ArrayWrapper.subArray(12, 27)));
        System.out.println();

        // 8. returns sum of all elements
        System.out.println("Exercise 8");
        System.out.println(ArrayWrapper.sum());
        System.out.println();

        // 9. add whole array
        System.out.println("Exercise 9");
        int[] newArr = new int[] {17, 77, 888};
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.add(newArr);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();

        // 10. add on specific position
        // if index greater then size -> throw ArrayIndexOutOfBoundsException
        System.out.println("Exercise 10");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.add(5, 64);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();


        // 11. prepend value
        System.out.println("Exercise 11");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.prepend(2018);
        ArrayWrapper.prepend(2017);
        ArrayWrapper.prepend(2016);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();


        // 12. set new value instead old value
        // if index greater then size -> throw ArrayIndexOutOfBoundsException
        System.out.println("Exercise 12");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println(ArrayWrapper.set(2, 1000));
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();



        // 13. search sub array
        System.out.println("Exercise 13");
        int[] testArr = new int[] {222, 333, 111};
        ArrayWrapper.add(testArr);
        ArrayWrapper.add(testArr);
        ArrayWrapper.add(testArr);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println(ArrayWrapper.searchSubArray(testArr));
        System.out.println();

        // 14. remove SubArray
        System.out.println("Exercise 14");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        int[] testDelArr = new int[] {222, 333, 111};
        ArrayWrapper.removeSubArray(testDelArr);
        ArrayWrapper.removeSubArray(testDelArr);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();





















    }

}
