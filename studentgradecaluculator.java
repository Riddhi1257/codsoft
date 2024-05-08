import java.util.*;

class GradeCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in math:");
        int math = sc.nextInt();
        System.out.println("Enter marks in biology:");
        int biology = sc.nextInt();
        System.out.println("Enter marks in physics:");
        int physics = sc.nextInt();
        System.out.println("Enter marks in chemistry:");
        int chemistry = sc.nextInt();
        System.out.println("Enter marks in social:");
        int social = sc.nextInt();
        System.out.println("Enter marks in English:");
        int english = sc.nextInt();

        int totalMarks = sum(math, biology, physics, chemistry, social, english);
        int averagePercentile = avg(totalMarks);
        System.out.println("The average percentile: " + averagePercentile + "%");
        System.out.println("Total marks: " + totalMarks);

        calculateGrade(averagePercentile);
    }

    static int sum(int math, int biology, int physics, int chemistry, int social, int english) {
        int total = math + biology + physics + chemistry + social + english;
        return total;
    }

    static int avg(int totalMarks) {
        int average = (totalMarks / 6); 
        return average;
    }

    static void calculateGrade(int average) {
        if (average >= 85) {
            System.out.println("Grade: A");
        } else if (average >= 65 && average < 85) {
            System.out.println("Grade: B");
        } else if (average >= 55 && average < 65) {
            System.out.println("Grade: C");
        } else if (average >= 45 && average < 55) {
            System.out.println("Grade: D");
        } else {
            System.out.println("FAIL");
        }
    }
}

 
