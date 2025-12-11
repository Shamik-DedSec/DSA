public class QuickSort {
    static void sort(int[] arr, int low, int high) {
        if(low < high) {
            int p = part(arr, low, high);
            sort(arr, low, p-1);
            sort(arr, p+1, high);
        }
    }
    static int part(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for(int j=low;j<high;j++) {
            if(arr[j] < pivot) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
            }
        }
        int t = arr[i];
        arr[i] = arr[high];
        arr[high] = t;
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,7,2,1,6};
        sort(arr,0,arr.length-1);
    }
}
