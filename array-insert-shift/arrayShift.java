
import java.util.Arrays;

public class arrayShift {
    public static void main(String[] args) {

        int x = 16;

        int array[] = { 42, 8, 15, 23, 42 };

        System.out.println(Arrays.toString(array));

        array = insertShiftArray(x, array);

        System.out.println(Arrays.toString(array));
    }

    public static int[] insertShiftArray(int x, int array[]) {


        int newArray[] = new int[array.length+1];
        int middle = Math.abs(array.length / 2);

        for (int i = 0; i < array.length+1; i++) {
            if (i < middle) {
                newArray[i] = array[i];
            }
            if (i == middle) {
                newArray[i] = x;
            } else if (i > middle) {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;

    }
}
