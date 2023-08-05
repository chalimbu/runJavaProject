package co.com;

public class BubleSort {


    public static boolean bubbleSort(int[] input) {
        if (input.length < 2) return false;
        boolean isInOrder;
        do {
            isInOrder = true;
            for (int i = 1; i < input.length; i++) {
                if (input[i - 1] > input[i]) {
                    int temporal = input[i - 1];
                    input[i - 1] = input[i];
                    input[i] = temporal;
                    isInOrder = false;
                }
            }
        } while (!isInOrder);
        return true;
    }

}
