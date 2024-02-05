public class updatebit {
    
    public static int setbit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clrbit(int n, int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    
    public static int update(int n, int i, int newb){
        if(newb==0){
            return clrbit(n, i);
        }
        else{
            return setbit(n, i);
        }
    }


    public static void main(String[] args) {
        System.out.println(update(10, 2, 1));
    }

}
