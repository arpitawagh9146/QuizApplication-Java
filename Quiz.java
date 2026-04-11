import java.util.*;

class Quiz {
    List<Question> questions = new ArrayList<>();
    int score = 0;

    void addQuestion(Question q) {
        questions.add(q);
    }

    void startQuiz() {gi
        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {
            System.out.println("\n" + q.question);

            for (int i = 0; i < q.options.length; i++) {
                System.out.println((i + 1) + ". " + q.options[i]);
            }

            System.out.print("Enter answer: ");
            int ans = sc.nextInt();

            if (ans == q.correctAnswer) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\nF Score: " + score);
    }
}