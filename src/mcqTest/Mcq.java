package mcqTest;

import java.util.List;

public class Mcq {

    private static Mcq mcq;

    private List<Question> questions;

    public Mcq() {
    }

    public Mcq(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public static Mcq getInstance() {
        if (mcq == null) {
            synchronized (Mcq.class) {
                if (mcq == null) {
                    mcq = new Mcq();
                }
            }
        }
        return mcq;
    }
}
