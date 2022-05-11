package co.com;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class mainClass {

    public static void main(String[] args){
        int[] arrayToOrder={1,3,4,2,5,1,2,4,5};

        bubleSort(arrayToOrder);

        printArray(arrayToOrder);
    }

    public static boolean bubleSort(int[] input){
        boolean isInOrder=true;
        if(input.length<=1){
            return false;
        }
        do{
            isInOrder=true;
            for(int i=1;i<input.length;i++){
                if(input[i-1]>input[i]){
                    int temporal=input[i];
                    input[i]=input[i-1];
                    input[i-1]=temporal;
                    isInOrder=false;
                }
            }

        }while(!isInOrder);

        return true;
    }

    public static void printArray(int[] input){
        if(input.length>0){
            for(int i=0;i<input.length;i++){
                System.out.print(" "+input[i]);
            }
        }
    }

}





