public class reverse_star {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<5; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.err.print("*");
            }
            System.out.println();
        }
    }
}
