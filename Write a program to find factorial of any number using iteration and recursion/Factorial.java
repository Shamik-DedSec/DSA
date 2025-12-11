public class Factorial {
    static int factRec(int n) {
        if(n==0) return 1;
        return n * factRec(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = 1;
        for(int i=1;i<=n;i++) ans *= i;
        System.out.println(ans);
        System.out.println(factRec(n));
    }
}
