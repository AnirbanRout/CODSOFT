package projects;

import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of subject " + i + " (out of 100): ");
            total += sc.nextInt();
        }

        double avg = (double) total / n;
        String grade;

        if (avg >= 90) grade = "A+";
        else if (avg >= 80) grade = "A";
        else if (avg >= 70) grade = "B";
        else if (avg >= 60) grade = "C";
        else if (avg >= 50) grade = "D";
        else grade = "F";

        System.out.println("\n📊 Results:");
        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + avg + "%");
        System.out.println("Grade = " + grade);
        sc.close();
    }
}
