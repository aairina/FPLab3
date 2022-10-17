package University;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> grades = List.of(new Integer[]{1, 22, 38, 45, 44, 84, 87, 40, 42, 53});

        System.out.println(Grades.maximumRoundedGrade(grades));
        System.out.println(Grades.failingGrades(grades));
        System.out.println(Grades.average(grades));
        System.out.println(Grades.roundedGrades(grades));

    }
}