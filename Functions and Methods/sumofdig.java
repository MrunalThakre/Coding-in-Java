import java.util.Scanner;

public class sumofdig {
    
    public static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            
            int lastDigit=n%10;
            sum+=lastDigit;
            n=n/10;
        }
        return sum;
        
    }

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sumOfDigits(num));
    }
}
