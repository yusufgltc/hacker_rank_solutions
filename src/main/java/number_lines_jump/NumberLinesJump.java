package number_lines_jump;

public class NumberLinesJump {
    public void numberLinesJump() {

        int x1 = 0;
        int v1 = 3;

        int x2 = 4;
        int v2 = 2;

        for (int i = 1; true; i++) {
            if (x1 + v1 * i == x2 + v2 * i) {
                System.out.println("YES");
                break;
            } else {
                System.out.println("NO");
            }
        }
    }
}
