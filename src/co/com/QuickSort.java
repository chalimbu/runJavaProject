package co.com;

public class QuickSort {
    public static void quickSort(int[] input){
        innerQuickSort(input,0,input.length);
    }


    private static void innerQuickSort(int[] input, int low, int max){
        if(low<max){
            int j=partition(input,low,max);

            innerQuickSort(input,low,j);
            innerQuickSort(input,j+1,max);
        }
    }

    private static int partition(int[] input, int low, int max){
        int i=low;
        int j=max;
        int pivot=input[low];

        while(i<j){
            do{
                i++;
            }while(i<input.length&&input[i]<=pivot);
            do{
                j--;
            }while(j>=0&&input[j]>pivot);
            if(i<j){
                switchVariables(input,i,j);
            }
        }
        switchVariables(input,low,j);
        return j;
    }

    private static void switchVariables(int array[], int a, int b){
        int temporal=array[a];
        array[a]=array[b];
        array[b]=temporal;
    }
}
