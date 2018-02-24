import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] myList = {12, 3, 5, -64, 2, 67, 7, 5, 54, -10};
        int max = myList[0], min = myList[0];
        System.out.println("Длинна массива = " + myList.length);
        System.out.print("Значения массива - " + Arrays.toString(myList));
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max)
                max = myList[i];
            if (myList[i] < min)
                min = myList[i];
        }
        System.out.println("\nМаксимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        for (int i = 0; i < myList.length; i++) {
            if (min == myList[i])
                myList[i] = 0;
            if (max == myList[i])
                myList[i] = 99;
        }
        System.out.print("Замена в массиве - " + Arrays.toString(myList));
    }
}