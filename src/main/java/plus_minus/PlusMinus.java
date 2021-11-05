package plus_minus;

import java.util.Random;

public class PlusMinus {
    public void plusMinus(){
        Random random = new Random();
        int[] arr = new int[5];
        int positive = 0;
        int negative = 0;
        int neutral = 0;

        for(int i =0; i<arr.length; i++){
            arr[i] = random.nextInt();
            System.out.println(java.util.Arrays.toString(arr));
            if(arr[i]>0){
                positive ++;
            }
            if(arr[i]<0){
                negative ++;
            }
            if(arr[i]==0){
                neutral ++;
            }
        }

        System.out.println("Positive value: " + (double) positive/arr.length );
        System.out.println("Negative value: " +(double) negative/arr.length );
        System.out.println("Neutral value: " + (double) neutral/arr.length );
    }
}
