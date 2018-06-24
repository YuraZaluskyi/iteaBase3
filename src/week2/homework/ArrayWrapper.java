package week2.homework;

public class ArrayWrapper {

    private static int[] arr = new int[10];
    private static int size = 0;

    public static void add(int num) {
        if (size >= arr.length) {
            extendArray();
        }
        arr[size++] = num;
    }

    private static void extendArray() {
        int[] newArr = new int[size << 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public static int[] getArr() {
        return arr.clone();
    }

    ////////////////////////////////////////////////////////////////////////////////////
    //////////////////////// H O M E   W O R K /////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////

    // 1. returns element by index///////////////////////////////////////////////////////
    public static int get(int index) {
        return arr[index];
    }

    // 2. copy of sorted array////////////////////////////////////////////////////////////
    public static int[] sort() {
        int[] newArr = new int[arr.length];
        newArr = getArr();
        int swap = 0;

        for (int i = 0; i < newArr.length - 1; i++) {

            for (int j = i + 1; j < newArr.length - 1; j++) {

                if (newArr[j] > newArr[i]) {
                    swap = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = swap;
                }
            }
        }
        return newArr;
    }


    // 3. remove by index////////////////////////////////////////////////////////////////////
    public static void remove(int index) {

        int[] newArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArray, 0, index);
        System.arraycopy(arr, index + 1, newArray, index, newArray.length - index);
        arr = newArray;
    }

    // 4. remove by value////////////////////////////////////////////////////////////////////
    public static void removeByValue(int value) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == value) {
                remove(i);
                break;
            }
        }
    }

    // 5. search by value/////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////
//    public static void search(int value) {} так було у завданні - метод нічого не повертає
//    може потрібно, щоб повертав boolean ?
//////////////////////////////////////////////////

    public static boolean search(int value) {

        boolean isPresent = false;
        for (int i : arr) {
            if (arr[i] == value) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    // 6. returns revers of array////////////////////////////////////////////////////////
    public static int[] revers() {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arr.length - 1 - i];
        }
        arr = newArray;
        return arr;
    }

    // 7. returns sub array//////////////////////////////////////////////////////////////////
    public static int[] subArray(int start, int end) {
        int[] newArray = new int[end - start + 1];
        System.arraycopy(arr, start, newArray, 0, end - start + 1);

        return newArray;
    }

    // 8. returns sum of all elements////////////////////////////////////////////////////////
    public static int sum() {
        int sum = 0;
        for (int i : arr) {
            sum += arr[i];
        }
        return sum;
    }

    // 9. add whole array
    public static void add(int[] newArr) {
        int[] jointArr = new int[arr.length + newArr.length];
        System.arraycopy(arr, 0, jointArr, 0, arr.length);
        System.arraycopy(newArr, 0, jointArr, arr.length, newArr.length);
        arr = jointArr;


//        for (int i = 0; i < newArr.length; i++) {
//            int newNum = newArr[i];
//            add(newNum); // можливо тут можна так add(newArr[i]) - і тоді це буде рекурсія ?!
//        }

    }

    // 10. add on specific position
    // if index greater then size -> throw ArrayIndexOutOfBoundsException
    public static void add(int index, int value) {
        int[] newArray = new int[arr.length + 1];
        if (index <= arr.length) {
            System.arraycopy(arr, 0, newArray, 0, index);
            System.arraycopy(arr, index, newArray, index + 1, newArray.length - index - 1);
            newArray[index] = value;
            arr = newArray;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    // 11. prepend value
    public static void prepend(int num) {
        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 1, arr.length);
        newArray[0] = num;
        arr = newArray;
    }

    // 12. set new value instead old value
    // if index greater then size -> throw ArrayIndexOutOfBoundsException
    public static int set(int index, int value) {
        int oldValue;
        if (index <= arr.length){
            oldValue = arr[index];
            arr[index] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
        return oldValue;
    }

    // 13. search sub array
    //   DEBAG - сила!!!!!!!!!!!!!
    // шукає та рахує кількість subArray
    public static int searchSubArray(int[] subArray) {
        int quantSubArr = 0;
        int quantElem;
        int i = 0;

        while (i <= arr.length - subArray.length) {
            quantElem = 0;

            if (arr[i] == subArray[0]) {
                quantElem = 1;

                for (int j = 1; j < subArray.length; j++) {

                    if (arr[i + j] == subArray[j]) {
                        quantElem++;
                    } else {
                        break;
                    }
                }

                if (quantElem == subArray.length) {
                    quantSubArr++;
                    i = i + subArray.length;
                } else {
                    i++;
                }

            } else {
                i++;
            }

        }
        return quantSubArr;
    }


    // 14. remove SubArray
    // видаляє перший subArray, котрий знаходить
    // здається, навіть працює ;-)
    public static void removeSubArray(int[] subArray) {
        int[] newArray = new int[arr.length - subArray.length];
        int quantElem;
        int start = 0;
        int i = 0;

        while (i <= arr.length - subArray.length) {
            quantElem = 0;

            if (arr[i] == subArray[0]) {
                quantElem = 1;

                for (int j = 1; j < subArray.length; j++) {

                    if (arr[i + j] == subArray[j]) {
                        quantElem++;
                    } else {
                        break;
                    }
                }

                if (quantElem == subArray.length) {
                    start = i;
                    System.arraycopy(arr, 0, newArray, 0, start);
                    System.arraycopy(arr, start + subArray.length, newArray, start, newArray.length - start);
                    arr = newArray;
                    break;
                } else {
                    i++;
                }

            } else {
                i++;
            }

        }

    }

}
