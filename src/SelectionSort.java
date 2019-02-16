public class SelectionSort implements SortingAlgorithm{
    /*
    * swap()
    * swaps 2 variables in an array
     */
    private static void swap(int[] a, int i, int j){
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /*
    * selection sort()
    * iterates through an array finding the smallest
    * element in the array at each step and swapping
    * it until the array is ordered from least to
    * greatest
     */
    @Override
    public void sort(int[] a) {
        for(int i = 0; i < (a.length-1); i++){ //O(n)
            swap(a, i,smallest(a,i)); //O(n^2)
        }
    }

    /*
    * smallest()
    * iterates through an array to find the smallest
    * element and returns the index of that element
     */
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