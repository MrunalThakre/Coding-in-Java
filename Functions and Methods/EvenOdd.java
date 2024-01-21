public class EvenOdd {

    public static boolean even(int n){
        boolean even=true;
        if(n%2!=0){
            even=false;
        }
        return even;
    }
    public static void main(String[] args) {
        System.out.println(even(5));
    }
    
}
