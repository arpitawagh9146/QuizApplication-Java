public class Main {
    public static void main(String[] args) {

        Quiz quiz = new Quiz();

        quiz.addQuestion(new Question(
            "Capital of India?",
            new String[]{"Mumbai", "Delhi", "Pune", "Chennai"},
            2
        ));

        quiz.addQuestion(new Question(
            "2 + 2 = ?",
            new String[]{"3", "4", "5", "6"},
            2
        ));

        quiz.startQuiz();
    }
}