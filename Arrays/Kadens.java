public class Kadens {
    
    public static void sum(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            currsum+=numbers[i];
            if(currsum <0){
                currsum=0;
            }
            maxsum=Math.max(currsum, maxsum);
        }
        System.out.println("Max Sum is: "+ maxsum);
    }

    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,3};
        sum(numbers);
    }
}
