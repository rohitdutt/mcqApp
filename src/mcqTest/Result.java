package mcqTest;

public class Result {

    private static Result result;

    private String userName;
    private int score;

    public Result() {
    }

    public Result(String userName, int score) {
        this.userName = userName;
        this.score = score;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getScore() {
        return score;
    }

    public void setScore() {
        this.score++;
    }

    public static Result getInstance() {
        if (result == null) {
            synchronized (Result.class) {
                if (result == null) {
                    result = new Result();
                }
            }
        }
        return result;
    }
}
