// This class runs the test and prints the result. if the code is successful - prints message Test passed!, if there's an error - prints message Test failed. 
public class Main {
    public static void main(String[] args) {
        if (Tester.testMergeSort()) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed.");
        }
    }
}
