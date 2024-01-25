import java.util.*;
public class Linear_Search {
    public static int Num(int N[], int num){
        for(int i=0; i<N.length; i++){
            if(N[i]==num){
                return i;
                
            }
           
        }
        return -1;
    }

    public static void main(String[] args) {
        int N[]={2,4,6,8,10,12,14,16};
        System.out.println("Enter number you want to find index of: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        Num(N, num);
        int index=Num(N, num);
        if(index==-1){
            System.out.println("Num not found");
        }
        else{
            System.out.println("Number found at  "+(index+1));
        }
    }
}
