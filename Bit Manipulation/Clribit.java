public class Clribit {
    
    public static int clrbit(int n, int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clrbit(10, 1));
    }
}
