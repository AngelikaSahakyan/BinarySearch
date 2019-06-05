public class BinarySearch {
    private int index = -1;

    private boolean innerBinarySearch(int[] arr, int elem, int start, int end) {
        if (start == end) {
            return false;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == elem) {
            index = mid;
            return true;
        }
        if (arr[mid] > elem) {
            return innerBinarySearch(arr, elem, start, mid);
        } else {
            return innerBinarySearch(arr, elem, mid + 1, end);
        }
    }

    public int getIndex() {
        return index;
    }

    boolean binarySearch(int arr[], int elem) {
        return innerBinarySearch(arr, elem, 0, arr.length);
    }
}
