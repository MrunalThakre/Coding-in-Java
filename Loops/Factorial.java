import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter Number to find the Factorial of: "); 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n==0){
            System.out.println("Fcatorial of 0 is 1");
        }
        else{
            int fact=1;
            for(int i=1; i<=n; i++){
                fact=fact*i;

            }
            System.out.println("Factorial of "+ n + " is " + fact);
        }

        
    }
}
