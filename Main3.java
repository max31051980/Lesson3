import java.util.Random;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(50)-25;
        }
        System.out.println("You Array is  " + Arrays.toString(myArray));
        System.out.print("You Array Reversed is  ");
        for (int i = myArray.length - 1; i >= 0; i--){
            System.out.print(myArray[i] + ", ");
        }
    }
}