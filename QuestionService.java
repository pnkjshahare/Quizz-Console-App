
import java.util.Scanner;
// Structure of multiple Question (question list)

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Prime Minister of India ?", "Narendra Modi", "Amit shah", "Nitin gadakari", "Pankaj", "Narendra Modi");
        questions[1] = new Question(2, "President of India ?", "Amit shah", "Narendra Modi", "Nitin gadakari", "Dropati Muramu", "Dropati Muramu");
        questions[2] = new Question(3, " Capital of India?", "Nagpur", "Mumbai", "Delhi", "benguluru", "Delhi");
        questions[3] = new Question(4, "Capital Of maharastra?", "Nagpur", "Mumbai", "Delhi", "benguluru", "Mumbai");
        questions[4] = new Question(5, "Cheif minitser of maharastra?", "Modi", "Devendra Fadnvis", "Ajit Pawar", "Nitin gadakri", "Devendra Fadnvis");
    }

    public void playQuizz() {
        int index = 0;
        for (Question q : questions) {
            System.out.println("Question No :" + q.getId());
            System.out.println("Question :" + q.getQuestion());
            System.out.println("option 1 :" + q.getOpt1());
            System.out.println("option 2 :" + q.getOpt2());
            System.out.println("option 3 :" + q.getOpt3());
            System.out.println("option 4 :" + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.nextLine();
            selection[index] = userAnswer;
            index++;

        }
        //user selected answer show
        // for (int i = 0; i < selection.length; i++) {
        //     System.out.println("user selected Answer :" + selection[i]);
        // }
    }

    public void getScore() {
        int quizzScore = 0;
        int index = 0;
        for (Question q : questions) {
            if (selection[index].equals(q.getAnswer())) {
                quizzScore++;
            }
            index++;
        }
        System.out.println("Your Quizz Score :" + quizzScore);
    }

}
