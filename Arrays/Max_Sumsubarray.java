public class Max_Sumsubarray {
    
        public static void subarray(int numbers[]){
            int currsum=0;
            int maxsum=Integer.MIN_VALUE;
        
            for(int i=0; i<numbers.length; i++){
                int curr=i;
                for(int j=i; j<numbers.length; j++ ){
                    int end=j;
                    currsum=0;
                    for(int k=curr; k<=end; k++){
                       currsum += numbers[k];
                    }
                    System.out.println(currsum);
                
                   if(currsum > maxsum){
                    maxsum = currsum;
                   }
                }
                
            }
            System.out.println("Max sum = "+maxsum);
            
           
        }
    
        public static void main(String[] args) {
            int numbers[]={2,4,6,8,10};
            subarray(numbers);
        }
    
}
