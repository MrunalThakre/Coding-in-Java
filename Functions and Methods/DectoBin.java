public class DectoBin {
    public static void DectoBin(int n){
        int pow=0;
        int dec=0;

        while(n>0){
            int rem=n%2;
            dec=dec+(rem*(int)Math.pow(10, pow));

            pow++;
            n=n/2;
        }
        System.out.println((dec));
    }
    public static void main(String[] args) {
        DectoBin(8);
    }
}
