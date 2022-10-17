package University;

import java.util.ArrayList;
import java.util.List;

public class Grades {

    static public int roundGrade(int grade) {
        int auxiliary = grade / 5; // we divide the grade by 5 to find how many times greater than 5 it is
        int nextMultipleOf5 = (auxiliary + 1) * 5;
        if (grade < 38) {
            return grade;
        }
        if (nextMultipleOf5 - grade < 3) {
            return nextMultipleOf5;
        }
        return grade;
    }

    static public List<Integer> failingGrades(List<Integer> grades) {
        List<Integer> failing = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade < 40) {
                failing.add(grade);
            }
        }
        return failing;
    }

    static public double average(List<Integer> grades) {
        double sum = 0.0;
        for (Integer grade : grades) {
            {
                sum += grade;
            }
        }
        return sum / grades.size();
    }

    static public List<Integer> roundedGrades(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        for (Integer grade : grades) {
            roundedGrades.add(roundGrade(grade));
        }
        return roundedGrades;
    }

    public static int maximumRoundedGrade(List<Integer> grades) {
        List<Integer> roundedGrades = roundedGrades(grades);
        int maxRoundedGrade = 0;
        for (Integer grade : roundedGrades) {
            if (grade > maxRoundedGrade) {
                maxRoundedGrade = grade;
            }
        }
        return maxRoundedGrade;
    }
}
