import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        int[] myList = new int[5];
        for (int i =0; i<myList.length; i++){
            myList[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(myList));

        // find the max from an array
        int max = myList[0];
        for(int i =0; i<myList.length;i++){
            if ( myList[i] > max){
                max =myList[i];
            }
        }
        System.out.println(max);

        for ( int i =myList.length -1;i>0;i--){
            int j = (int)(Math.random()*(i+1));
            System.out.println("i "+i);
            System.out.println("j "+ j);

            // swap
            int temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
            System.out.println(myList[i]+"  "+myList[j]);
        }
        System.out.println(Arrays.toString(myList));


    }



}