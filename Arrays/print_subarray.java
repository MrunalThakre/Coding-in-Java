public class print_subarray {
    public static void subarray(int numbers[]){
        int ts=0;
        for(int i=0; i<numbers.length; i++){
            int curr=i;
            for(int j=i; j<numbers.length; j++ ){
                int end=j;
                for(int k=curr; k<=end; k++){
                    System.out.print(numbers[k]+" " );
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sum =" + ts);
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subarray(numbers);
    }
}
