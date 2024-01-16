import java.util.Scanner;
public class conditional_statement_5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year: ");
        int year=sc.nextInt();
        if(year % 4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Year is Leap");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }
            else{
                System.out.println("Year is a Leap Year");
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
