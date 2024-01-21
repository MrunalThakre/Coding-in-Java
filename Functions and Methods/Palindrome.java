import java.util.Scanner;

public class Palindrome {

        public static boolean isPalindrome(int n){
          int reverse=0;
          int num=n;

            while(num!=0){
                int lastDigit=num%10;
                reverse=reverse*10+lastDigit;
                num=num/10;
            }
            
            if(n==reverse){
                return true;
            }
            return false;
        }
    
        public static void main(String[] args) {
            System.out.println("Enter n");
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();

            if(isPalindrome(num)){
                System.out.println("is Palindrome");
            }
            else{
                System.out.println("Not Palindrome");
            }
        }
    
}
