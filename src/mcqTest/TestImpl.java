package mcqTest;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

public class TestImpl {

    private Mcq mcq;
    private Result result;

    public TestImpl() {
        mcq = Mcq.getInstance();
        result = Result.getInstance();
    }

    public void loadTest(){
        try (Reader reader = new FileReader("C:\\Users\\lenovo\\Desktop\\dev\\mcqApp\\src\\data\\data.json")) {
            Gson gson = new Gson();

            Type type = new TypeToken<List<Question>>() {}.getType();

            List<Question> questions = gson.fromJson(reader, type);

            mcq.setQuestions(questions);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startTest(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name to start test:");
        result.setUserName(scanner.nextLine());

        List<Question> questions = mcq.getQuestions();
        for (int i = 1; i <= questions.size(); i++) {
            System.out.println(i + "). " + questions.get(i - 1).getQuestion());
            List<Answer> answers = questions.get(i - 1).getAnswers();

            for (int j = 1; j <= answers.size(); j++) {
                System.out.println(j + ". " + answers.get(j - 1).getAnswer());
            }

            System.out.println("Select answer:");

            if(answers.get(scanner.nextInt() - 1).isCorrect()){
                result.setScore();
            }

            System.out.println();
        }

    }

    public void getResult(){
        System.out.println("Hi " + result.getUserName() + " your score is " + result.getScore() + "/" + Question.TOTAL_QUESTIONS);
    }

}
