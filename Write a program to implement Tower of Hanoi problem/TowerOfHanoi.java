public class TowerOfHanoi {
    static void move(int n, char from, char to, char aux) {
        if(n==1) {
            System.out.println(from+" "+to);
            return;
        }
        move(n-1, from, aux, to);
        System.out.println(from+" "+to);
        move(n-1, aux, to, from);
    }
    public static void main(String[] args) {
        move(3,'A','C','B');
    }
}
