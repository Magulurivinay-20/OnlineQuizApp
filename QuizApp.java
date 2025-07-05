import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> quiz = new ArrayList<>();

        // Add Questions
        quiz.add(new Question("What is Java?", new String[]{"OS", "Programming Language", "App", "IDE"}, 2));
        quiz.add(new Question("Which loop is entry-controlled?", new String[]{"do-while", "while", "both", "none"}, 2));
        quiz.add(new Question("Which collection allows duplicate elements?", new String[]{"Set", "List", "Map", "None"}, 2));
        quiz.add(new Question("How to sort a list in Java?", new String[]{"Collections.shuffle()", "Collections.sort()", "Arrays.sort()", "List.sort()"}, 2));

        Collections.shuffle(quiz); // Shuffle the question list

        int score = 0;

        for (Question q : quiz) {
            q.display();
            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();
            if (q.isCorrect(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong!\n");
            }
        }

        System.out.println("Your final score: " + score + "/" + quiz.size());
        sc.close();
    }
}
