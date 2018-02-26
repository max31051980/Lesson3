import java.util.Random;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int arrayLength = myArray.length;
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            myArray[i] = random.nextInt(10) - 5;
        }
        System.out.println("You Array is  " + Arrays.toString(myArray));
        boolean repeated[] = new boolean[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int count = 1;
            for (int j = i + 1; j < arrayLength && !repeated[i]; j++) {
                if (myArray[i] == myArray[j]) {
                    repeated[j] = true;
                    count++;
                }
            }
            if (count >= 2) System.out.println("Number " + myArray[i] + " is repeated " + count + " times");
        }
    }
}