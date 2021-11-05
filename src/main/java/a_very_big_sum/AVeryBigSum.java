package a_very_big_sum;

import java.util.Arrays;
import java.util.List;

public class AVeryBigSum {
    public void aVeryBigSum() {
        long sum = 0;
        List<Integer> list = Arrays.asList(1000000001,1000000002,1000000003,1000000004,1000000005);

        for(int i=0; i<list.size(); i++){
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
