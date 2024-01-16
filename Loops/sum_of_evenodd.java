import java.util.*;
public class sum_of_evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n;
       int c;

        int sum_even=0;
        int sum_odd=0;
        
        do{
            System.out.println("Enter Number: ");
            n=sc.nextInt();
            
            if(n%2==0){
                sum_even+=n;
            }
            else{
                sum_odd+=n;
            }
            System.out.println("If you want to enter more numbers: press 1 else 0");
            c=sc.nextInt();
        }
        while(c==1);
    
    System.out.println("Sum of even numbers: "+ sum_even );
    System.out.println("Sum of odd numbers: "+ sum_odd );
    }
}
