public class SelectionSort implements SortingAlgorithm{

    private static void swap(int[] a, int i, int j){
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    @Override
    public void sort(int[] a) {
        for(int i = 0; i < (a.length-1); i++){ //O(n)
            swap(a, i,smallest(a,i)); //O(n^2)
        }
    }

    private static int smallest(int[] a, int start){ //O(n)
        int small = start;
        for(int i = (start+1); i < a.length; i++){
            if(a[i] < a[small]){
                small = i;
            }
        }
        return small;
    }
}