package programming_task_lunarlogic;

public class ProgrammingTaskLunarLogicPinCode {

    /** This is a programming task for BECOME A PART OF LUNAR LOGIC'S INTERNSHIP PROGRAM
     * @author Yusuf Gultac
     * @author https://linktr.ee/yusufgltc
     * @version 1.0
     * @since 1.0
     */
    public void programmingTaskLunarLogicPinCode() {
        pinCode();
    }

    /** Instruction give us the length of the pin. Here our pin is five-figure
     * @param firstInstruction The first instruction value of pin
     * @param secondInstruction The second instruction value of pin
     * @param thirdInstruction The third instruction value of pin
     * @param fourthInstruction The fourth instruction value of pin
     * @param fifthInstruction The fifth instruction value of pin
     */

    String firstInstruction = "RLRLLLULULULUUDUULULRDDLURURDDLDUUDDLRDDUUUDD";
    String secondItInstruction = "LDLRLDDDLUDRDRRUDUURLRULLUDDRLURLUULDLLRLLUDLRLRUDLULRLRRL";
    String thirdItInstruction = "LLRRDURRDLDULRDUDLRDRDRURULDU";
    String fourthItInstruction = "DULRRDRLRLUDLLURURLLRLRDLLDLLDRDUURL";
    String fifthItInstruction = "DUULULUUDUDLLRLRURULLDLRRLURDLLDUDUDDRURRLUDULULD";

    /**
     * Convert instructions to char array. Code analyzes character by character each array's values.
     */
    char[] arr1 = firstInstruction.toCharArray();
    char[] arr2 = secondItInstruction.toCharArray();
    char[] arr3 = thirdItInstruction.toCharArray();
    char[] arr4 = fourthItInstruction.toCharArray();
    char[] arr5 = fifthItInstruction.toCharArray();

    /**
     * Number pad is an analytic plane that numbers are placed into it.
     */
    int[][] matrixNumPad = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
    };

    /**
     * Value of pin's figure.
     */
    int pin_1;
    int pin_2;
    int pin_3;
    int pin_4;
    int pin_5;

    /**
     * @param startValue At the very beginning you start with "5"
     * @param currentValue The instructions consist of letters that tell you how to move on analytic plane
     */
    int startValue = matrixNumPad[1][1];
    int currentValue = startValue;


    private void pinCode() {
        firstValueOfPin();
        secondValueOfPin();
        thirdValueOfPin();
        fourthValueOfPin();
        fifthValueOfPin();
    }

    /**
     *  This method defines that first figure of pin.
     */
    private void firstValueOfPin() {

        for (char c : arr1) {
            if (c == 'R') {
                directionRight(currentValue);
            }
            if (c == 'L') {
                directionLeft(currentValue);
            }
            if (c == 'U') {
                directionUp(currentValue);
            }
            if (c == 'D') {
                directionDown(currentValue);
            }
            currentValue = startValue;
            pin_1 = startValue;
        }
        System.out.print(pin_1);
    }

    /**
     *  This method defines that second figure of pin
     */
    private void secondValueOfPin() {
        for (char c : arr2) {
            if (c == 'R') {
                directionRight(currentValue);
            }
            if (c == 'L') {
                directionLeft(currentValue);
            }
            if (c == 'U') {
                directionUp(currentValue);
            }
            if (c == 'D') {
                directionDown(currentValue);
            }
            currentValue = startValue;
            pin_2 = startValue;
        }
        System.out.print(pin_2);
    }

    /**
     *  This method defines that third figure of pin
     */
    private void thirdValueOfPin() {
        for (char c : arr3) {
            if (c == 'R') {
                directionRight(currentValue);
            }
            if (c == 'L') {
                directionLeft(currentValue);
            }
            if (c == 'U') {
                directionUp(currentValue);
            }
            if (c == 'D') {
                directionDown(currentValue);
            }
            currentValue = startValue;
            pin_3 = startValue;
        }
        System.out.print(pin_3);
    }

    /**
     *  This method defines that fourth figure of pin
     */
    private void fourthValueOfPin() {
        for (char c : arr4) {
            if (c == 'R') {
                directionRight(currentValue);
            }
            if (c == 'L') {
                directionLeft(currentValue);
            }
            if (c == 'U') {
                directionUp(currentValue);
            }
            if (c == 'D') {
                directionDown(currentValue);
            }
            currentValue = startValue;
            pin_4 = startValue;
        }
        System.out.print(pin_4);
    }

    /**
     *  This method defines that fifth figure of pin
     */
    private void fifthValueOfPin() {
        for (char c : arr5) {
            if (c == 'R') {
                directionRight(currentValue);
            }
            if (c == 'L') {
                directionLeft(currentValue);
            }
            if (c == 'U') {
                directionUp(currentValue);
            }
            if (c == 'D') {
                directionDown(currentValue);
            }
            currentValue = startValue;
            pin_5 = startValue;
        }
        System.out.print(pin_5);
    }

    /**
     * Direction methods help us move on the matrix plane. Each number has its own probabilities therefore I used the "switch-case" statement.
     * You cannot get out of bounds of matrix plane. For example, you cannot go up or to the left of the number 1.
     * @param currentValue The instructions consist of letters that tell you how to move on analytic plane. The value is changed by them.
     */
    private void directionRight(int currentValue) {

        switch (currentValue) {
            case 1 -> startValue = matrixNumPad[0][1];
            case 2, 3 -> startValue = matrixNumPad[0][2];
            case 4 -> startValue = matrixNumPad[1][1];
            case 5, 6 -> startValue = matrixNumPad[1][2];
            case 7 -> startValue = matrixNumPad[2][1];
            case 8, 9 -> startValue = matrixNumPad[2][2];
        }
    }

    private void directionLeft(int currentValue) {

        switch (currentValue) {
            case 1, 2 -> startValue = matrixNumPad[0][0];
            case 3 -> startValue = matrixNumPad[0][1];
            case 4, 5 -> startValue = matrixNumPad[1][0];
            case 6 -> startValue = matrixNumPad[1][1];
            case 7, 8 -> startValue = matrixNumPad[2][0];
            case 9 -> startValue = matrixNumPad[2][1];
        }
    }

    private void directionUp(int currentValue) {

        switch (currentValue) {
            case 1, 4 -> startValue = matrixNumPad[0][0];
            case 2, 5 -> startValue = matrixNumPad[0][1];
            case 3, 6 -> startValue = matrixNumPad[0][2];
            case 7 -> startValue = matrixNumPad[1][0];
            case 8 -> startValue = matrixNumPad[1][1];
            case 9 -> startValue = matrixNumPad[1][2];
        }
    }

    private void directionDown(int currentValue) {

        switch (currentValue) {
            case 1 -> startValue = matrixNumPad[1][0];
            case 2 -> startValue = matrixNumPad[1][1];
            case 3 -> startValue = matrixNumPad[1][2];
            case 4, 7 -> startValue = matrixNumPad[2][0];
            case 5, 8 -> startValue = matrixNumPad[2][1];
            case 6, 9 -> startValue = matrixNumPad[2][2];
        }
    }
}