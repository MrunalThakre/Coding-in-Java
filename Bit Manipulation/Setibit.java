public class Setibit {

    public static int setbit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(setbit(10, 2));
    }
    
}
