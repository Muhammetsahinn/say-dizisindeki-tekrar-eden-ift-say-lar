import java.util.Arrays;
import java.util.Scanner;

public class main2 {

    static boolean isFind(int[] arr , int value){
        for(int i : arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {21,31,43,24,34,22,21,24,54,76,-54,56,34,0,234};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        //int count=1;
        //int top = 0;

       for(int i = 0; i < list.length; i++){
           for(int j = 0; j < list.length; j++){
               if(i != j && list[i] == list[j]){
                   if(!isFind(duplicate , list[i])){
                       duplicate[startIndex++] = list[i];
                   }
                   break;
                       //top = list[i];
                       //count++;
               }
               //System.out.println(list[i]);
           }

           //System.out.println( " Sayisi " + count + " kadar tekrar edildi. " );
       }
        for(int value : duplicate){
            if(value%2==0) {
                if (value != 0) {
                    System.out.println(value);
                }
            }
        }
    }
}