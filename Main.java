// This class runs the test and prints the result
public class Main {
    public static void main(String[] args) {
        if (Tester.testMergeSort()) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed.");
        }
    }
}
