package compare_the_triplets;

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    public void compareTheTriplets(){
        int alice_score = 0;
        int bob_score = 0;
        List<Integer> alice = Arrays.asList(17,28,30);
        List<Integer> bob = Arrays.asList(99,16,8);

        for(int i = 0; i<alice.size(); i++){
            if(alice.get(i) > bob.get(i)){
                alice_score++;
            }

            if(bob.get(i) > alice.get(i)){
                bob_score++;
            }

            if(bob.get(i).equals(alice.get(i))){
                //do nothing
            }

        }
        System.out.println(alice_score);
        System.out.println(bob_score);
    }
}
