package grading_student;

import java.util.Arrays;

public class GradingStudent {
    public void gradingStudent() {
        int[] gradeList = new int[]{73, 67, 38, 33};
        for (int i = 0; i < gradeList.length; i++) {
            if (gradeList[i] >= 38) {
                int reminder = gradeList[i] % 5;
                int least_multiple = gradeList[i] - reminder;
                int upper_multiple = least_multiple + 5;
                int difference = upper_multiple - gradeList[i];

                if (difference < 3) {
                    gradeList[i] = upper_multiple;
                }
            }
        }
        System.out.println(Arrays.toString(gradeList));
    }
}
