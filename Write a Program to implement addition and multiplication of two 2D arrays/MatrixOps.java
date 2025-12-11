public class MatrixOps {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{5,6},{7,8}};
        int[][] add = new int[2][2];
        int[][] mul = new int[2][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                add[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                int sum = 0;
                for(int k=0;k<2;k++) sum += a[i][k] * b[k][j];
                mul[i][j] = sum;
            }
        }
    }
}
