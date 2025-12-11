public class FirstLast {
    public static void main(String[] args) {
        int[] arr = {2,4,4,4,7,9};
        int x = 4;
        int first = -1, last = -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==x) {
                if(first==-1) first = i;
                last = i;
            }
        }
        System.out.println(first);
        System.out.println(last);
    }
}
