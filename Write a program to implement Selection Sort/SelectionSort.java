public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};
        for(int i=0;i<arr.length;i++) {
            int min = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j] < arr[min]) min = j;
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
    }
}
