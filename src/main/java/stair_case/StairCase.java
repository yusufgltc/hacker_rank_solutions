package stair_case;

public class StairCase {
    public void stairCase(){
        for(int star = 1; star<=6; star++){
            int space = 6-star;
            for(int i = 0; i<space; i++){
                System.out.print(' ');
            }

            for(int i=0; i<star; i++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
