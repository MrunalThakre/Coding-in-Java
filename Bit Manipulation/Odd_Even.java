public class Odd_Even {
    

    public static void check(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        check(11);
        check(12);
    }
}
