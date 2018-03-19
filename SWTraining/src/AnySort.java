public class AnySort<T extends Countable> {

    T[] inputArr;

    public AnySort(T[] input) {
        inputArr = input;

    }

    void sort(int left, int right) {
        int l = left;
        int r = right;
        if (inputArr == null)
            return;
        int pivot = inputArr[(l + r) / 2].getValue();

        do {
            while (inputArr[l].getValue() < pivot) l++;

            while (inputArr[r].getValue() > pivot) r--;

            if (l <= r) {
                int temp = inputArr[r].getValue();
                inputArr[r].setValue(inputArr[l].getValue());
                inputArr[l].setValue(temp);
                l++;
                r--;
            }
        } while (l <= r);

        if (left < r)
            sort(left, r);
        if (l < right)
            sort(l, right);
    }
}