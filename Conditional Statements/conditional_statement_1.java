import java.util.*;
public class conditional_statement_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a=sc.nextInt();
        if(a<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is positive");
        }
    }
}
