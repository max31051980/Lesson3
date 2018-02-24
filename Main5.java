import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Integer arr[] = new Integer[10];
        System.out.print("\nUnsorted Array:          ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100-50);
            System.out.print(arr[i] + "  ");
        }
        Arrays.sort(arr);
        System.out.print("\nSorted by acsending:     ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + "  ");
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("\nSorted by descending:    ");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + "  ");
    }
}