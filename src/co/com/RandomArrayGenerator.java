package co.com;

public class RandomArrayGenerator {
    public static int[] generateRandomArrayOfSize(int n){
        int[] array=new int[n];
        for(int i=0;i<array.length;i++){
            array[i]=(int) Math.round(Math.random()*100000);
        }
        return array;
    }

    public static boolean printArray(int[] input){
        return printArray(input,input.length);
    }
    public static boolean printArray(int[] input,int upTo) {
        if (input.length == 0) {
            return false;
        }
        System.out.println("[");
        for (int i = 0; i < input.length && i<upTo; i++) {
            System.out.print("," + input[i]);
        }
        System.out.println("[");
        return true;
    }
}
