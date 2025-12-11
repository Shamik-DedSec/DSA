public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int x = 4;
        int left = 0, right = arr.length-1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(arr[mid]==x) {
                System.out.println(mid);
                break;
            }
            if(arr[mid] < x) left = mid+1;
            else right = mid-1;
        }
    }
}
