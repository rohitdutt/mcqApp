import mcqTest.TestImpl;

public class Main {
    public static void main(String[] args) {
        try {
            TestImpl test = new TestImpl();
            test.loadTest();
            test.startTest();
            test.getResult();
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            System.out.println("Something went wrong, rerun test!");
        }
    }
}