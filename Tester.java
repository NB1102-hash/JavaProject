import java.util.Arrays;

public class Tester {
    public static boolean testMergeSort() {
        String[] input = {"March", "January", "December"};
        String[] expected = {"December", "January", "March"};
        String[] result = Sorter.mergeSort(input, 0, input.length - 1);

        return Arrays.equals(expected, result);
    }
}
