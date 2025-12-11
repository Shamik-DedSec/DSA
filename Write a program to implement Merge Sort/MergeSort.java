public class MergeSort {
    static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] a = new int[n1];
        int[] b = new int[n2];
        for(int i=0;i<n1;i++) a[i] = arr[left+i];
        for(int j=0;j<n2;j++) b[j] = arr[mid+1+j];
        int i=0,j=0,k=left;
        while(i<n1 && j<n2) {
            if(a[i] <= b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while(i<n1) arr[k++] = a[i++];
        while(j<n2) arr[k++] = b[j++];
    }
    public static void main(String[] args) {
        int[] arr = {5,1,6,2,3};
        mergeSort(arr,0,arr.length-1);
    }
}
