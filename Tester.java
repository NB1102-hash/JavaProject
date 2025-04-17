import java.util.Arrays;
// This class tests the merge sort method using month names
public class Tester {
    // Returns true if the sorting method works correctly
    public static boolean testMergeSort() {
        String[] input = {"March", "January", "December"};
        String[] expected = {"December", "January", "March"};
        String[] result = Sorter.mergeSort(input, 0, input.length - 1);

        return Arrays.equals(expected, result);
    }
}
