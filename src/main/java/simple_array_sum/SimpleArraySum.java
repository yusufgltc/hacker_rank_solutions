package simple_array_sum;

import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {
    public void simpleArraySum() {
        int list_sum = 0;
        List<Integer> ar = Arrays.asList(1, 2, 3, 4, 10, 11);

        //System.out.println(list);
        for (int i = 0; i < ar.size(); i++) {
            list_sum = list_sum + ar.get(i);
        }

        System.out.println(list_sum);
    }
}
