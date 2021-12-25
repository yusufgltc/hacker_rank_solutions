package cats_and_mouse;

import com.sun.tools.javac.Main;

public class CatsAndMouse {
    public void catsAndMouse(){
        int[] situationFirst = new int[]{1,2,3};
        int[] situationSecond = new int[]{1,3,2};
        int distanceA = Math.abs(situationSecond[0] - situationSecond[2]);
        int distanceB = Math.abs(situationSecond[1] - situationSecond[2]);

        if (distanceA<distanceB){
            System.out.println("Cat A");
        }else  if (distanceA>distanceB){
            System.out.println("Cat B");
        }else {
            System.out.println("Mouse C");
        }
    }
}
