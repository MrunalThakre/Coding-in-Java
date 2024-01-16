import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter number whsoe table you want to print: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n + " X " + i + " = " + (n*i));
        }
        
    }
}
