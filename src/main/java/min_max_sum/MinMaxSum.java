package min_max_sum;

import java.util.Arrays;

public class MinMaxSum {
    public void minMaxSum(){
        int max = 0;
        int min = 0;
        int[] list = new int[]{1,2,3,4,5};
        Arrays.sort(list);

        for(int i = 0; i<list.length-1;i++){
            min = min + list[i];
        }
        System.out.println(min);


        for(int i = list.length-1; i>0; i--){
            max = max + list[i];
        }

        System.out.println(max);
    }
}
