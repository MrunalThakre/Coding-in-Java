import java.util.Scanner;

public class numberofsundays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        sc.close();

        String days[]={"mon","tue","wed","thu","fri", "sat","sun"};
        int startday=0;

        for(int i=0; i<days.length; i++){
            if(days[i].equals(str)){
                startday=i;
                break;
            }

           

        }
        int date = 30-n;
        int reqday = 6-startday;
        int res = date/reqday;
        System.out.println(res);

        
    }
    
}
