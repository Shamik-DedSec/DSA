public class LinearSearch2D {
    public static void main(String[] args) {
        int[][] m = {{1,2},{3,4}};
        int x = 4;
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                if(m[i][j]==x) System.out.println(i+" "+j);
            }
        }
    }
}
