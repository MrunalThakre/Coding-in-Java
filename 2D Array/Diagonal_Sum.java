public class Diagonal_Sum {
    
    public static void sum(int matrix[][]){
        int n=matrix.length;
        int m= matrix[0].length;
        int sum=0;
        for(int i=0; i<n; i++ ){
            for(int j=0; j<m; j++){
                if(i==j){
                    sum += matrix[i][j];
                }

                else if(i+j == n-1){
                    sum+=matrix[i][j];
                }
            }
            
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

                        sum(matrix);
    }
}
