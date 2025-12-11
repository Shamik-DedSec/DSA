import java.util.*;

public class InsertDeleteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[100];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        int value = sc.nextInt();
        int pos = sc.nextInt();
        for(int i=size;i>pos;i--) arr[i] = arr[i-1];
        arr[pos] = value;
        size++;
        int del = sc.nextInt();
        for(int i=del;i<size-1;i++) arr[i] = arr[i+1];
        size--;
        for(int i=0;i<size;i++) System.out.print(arr[i]+" ");
    }
}
