package co.com;

public class mainClass {
    public static void main(String args[]){
       int[] input= {3,2,4,1,5,8,9,1,2,3};
       quickSort(input);
       printArray(input);
    }


    public static void quickSort(int[] input){
        innerQuickSort(input,0,input.length);
    }

    public static void printArray(int[] input){
        for(int i=0;i<input.length;i++){
            System.out.println("-"+input[i]);
        }
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





