public class Sorter {
    public static String[] mergeSort(String[] months, int left, int right) {
        if (left >= right) {
            return new String[] { months[left] };
        }

        int midpoint = (left + right) / 2;

        String[] leftArray = mergeSort(months, left, midpoint);
        String[] rightArray = mergeSort(months, midpoint + 1, right);

        return merge(leftArray, rightArray);
    }

    private static String[] merge(String[] left, String[] right) {
        String[] result = new String[left.length + right.length];
        int leftPointer = 0, rightPointer = 0, resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer].compareTo(right[rightPointer]) <= 0) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }

        return result;
    }
}
