import java.util.Scanner;

public class ExamScoreTracker {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 5;
        int[] examScores = new int[NUM_STUDENTS];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter exam scores for each student:");

        // Input exam scores with validation
        for (int i = 0; i < NUM_STUDENTS; i++) {
            while (true) {
                System.out.print("Enter score for student " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    int score = scanner.nextInt();
                    if (score >= 0 && score <= 100) {
                        examScores[i] = score;
                        break;
                    } else {
                        System.out.println("Please enter a score between 0 and 100.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // clear invalid input
                }
            }
        }

        // Calculate sum, highest score, and average
        int sum = 0;
        int highestScore = examScores[0];

        for (int score : examScores) {
            sum += score;
            if (score > highestScore) {
                highestScore = score;
            }
        }

        double average = (double) sum / NUM_STUDENTS;

        // Display results
        System.out.println("\nExam score statistics:");
        System.out.println("Scores entered: ");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("Student " + (i + 1) + ": " + examScores[i]);
        }
        System.out.println("Sum of all scores: " + sum);
        System.out.println("Average score: " + average);
        System.out.println("Highest score attained: " + highestScore);

        scanner.close();
    }
}
