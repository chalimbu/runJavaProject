package co.com;

import java.util.Arrays;

public class mainClass {
    public static void main(String args[]){
       int[] input= RandomArrayGenerator.generateRandomArrayOfSize(10000);

       int[] copyQuickSort= Arrays.copyOf(input,input.length);
       System.out.println("Ordenando con quick sort");
        RandomArrayGenerator.printArray(copyQuickSort,100);
       Long millis=System.nanoTime();
        QuickSort.quickSort(copyQuickSort);
        millis=System.nanoTime()-millis;
        System.out.println("Ordenado en "+millis);
        RandomArrayGenerator.printArray(copyQuickSort,100);

        int[] copyBubleSort=Arrays.copyOf(input,input.length);
        System.out.println("Ordenando con bubble sort");
        RandomArrayGenerator.printArray(copyBubleSort,100);
        millis=System.nanoTime();
        BubleSort.bubbleSort(copyBubleSort);
        millis=System.nanoTime()-millis;
        System.out.println("Ordenado en "+millis);
        RandomArrayGenerator.printArray(copyBubleSort,100);
    }


}





