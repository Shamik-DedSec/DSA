public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,9};
        int min = arr[0];
        int max = arr[0];
        for(int x:arr) {
            if(x < min) min = x;
            if(x > max) max = x;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
