public class BubbleSort implements SortingAlgorithm{

    private static void swap(int[] a, int i, int j){
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    @Override
    public void sort(int[] a) {
        boolean swapped = true;
        for(int j = 0;j<a.length-1 && swapped;j++) {//O(n)
            swapped = false;
            for (int i = 0; i < a.length - 1 - j; i++) {//O(n)
                if (a[i] > a[i+1]) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }
        }
    }
}