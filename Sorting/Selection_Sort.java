public class Selection_Sort {
    
    public static void sort(int numbers[]){
        for(int i=0; i<numbers.length-1; i++){
            int smallest=i;
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[smallest]>numbers[j]){
                    smallest=j;
                }
            }
            int temp=numbers[smallest];
                    numbers[smallest]=numbers[i];
                    numbers[i]=temp;

        }
    }

    public static void print(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[]={5,4,1,3,2};
        sort(numbers);
        print(numbers);
    }
}
