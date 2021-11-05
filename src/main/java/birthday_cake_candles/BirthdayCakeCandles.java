package birthday_cake_candles;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {
    public void birthdayCakeCandles() {
        List<Integer> list = Arrays.asList(3, 2, 1, 3);
        //ArrayList arrayList = Arrays.asList("a");
        int count_max = 0;
        int max_value = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == max_value) {
                count_max++;
            }

            if (list.get(i) > max_value) {
                max_value = list.get(i);
                count_max = 1;
            }

        }
        System.out.println(max_value);
        System.out.println(count_max);
    }
}
