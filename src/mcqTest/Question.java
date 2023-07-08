package mcqTest;

import java.util.List;

public class Question {

    public static final int TOTAL_QUESTIONS = 10;
    private String question;
    private List<Answer> answers;

    public Question() {
    }

    public Question(String question, List<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
