package sales_by_match;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SalesByMatch {
    public void salesByMatch(){
        HashSet<Integer> socksList = new HashSet<Integer>(Arrays.asList(10,20,20,10,10,30,50,10,20));
        ArrayList<Integer> list = new ArrayList<Integer>(socksList);
        int pair_count = 0;
        for(int i = 0; i<=socksList.size(); i++){
            int element = list.get(i);
            if(socksList.contains(element)){
                socksList.remove(element);
                pair_count ++;
            }else{
                socksList.add(element);
            }
        }
        System.out.println(pair_count);
    }
}
