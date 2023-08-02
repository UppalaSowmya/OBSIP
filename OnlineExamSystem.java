import java.util.Scanner;

public class OnlineExamSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;

        System.out.println("Welcome to the Online Exam System!");

        while (true) {
            // Login
            System.out.print("Username: ");
            username = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();

            // Check login credentials
            if (username.equals("sowmya") && password.equals("sowmya@123")) {
                break; // Break out of the loop if login is successful
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        System.out.println("--- Exam ---");
        System.out.println("Enter your answers:");

        // Questions
        String[] questions = {
            "What is the capital of India?",
            "Which color symbolizes peace?",
            "Sun rises in the.....",
            "Name the largest planet of our Solar System?"
        };

        // Correct answers
        String[] correctAnswers = {
            "New Delhi",
            "White",
            "East",
            "Jupiter"
        };

        int totalQuestions = questions.length;
        int score = 0;

        // Ask questions and get answers
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i]);
            System.out.print("Ans. ");
            String userAnswer = scanner.nextLine();

            // Validate the user's answer against the correct answer
            if (userAnswer.equalsIgnoreCase(correctAnswers[i])) {
                score++; // Increase the score if the answer is correct
            }
        }

        System.out.println("--- Exam Results ---");
        System.out.println("Total Questions: " + totalQuestions);
        System.out.println("Correct Answers: " + score);
        System.out.println("Incorrect Answers: " + (totalQuestions - score));

        System.out.println("--- Session Closed ---");
        System.out.println("Logged out successfully.");
        scanner.close();
    }
}
