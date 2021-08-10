public class TwoDimensionalArray {
    static void transposeMat(int A[][])
    {
        for (int i = 0; i < 3; i++)
            for (int j = i+1; j < 3; j++)
            {
                 int temp = A[i][j];
                 A[i][j] = A[j][i];
                 A[j][i] = temp;
            }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    static boolean checkIdentity(int[][] A){
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++){
                if(i!=j){
                    if(A[i][j]!=0){
                        return false;
                    }
                }
                else{
                    if(A[i][j]!=1)
                    return false;
                }
            }
        }
        return true;
    }
    static boolean checkSparse(int[][] A){
        int c=0;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++){
                if(A[i][j]==0){
                    c++;
                }
            }
        }
        if(c>9/2){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        /* int[][] A={ {1,2,3},
                    {4,5,6},
                    {7,8,9}}; */
        int[][] A={ {1,0,0},
                    {0,1,0},
                    {0,0,1}};
        transposeMat(A);
        System.out.println("Identity:"+checkIdentity(A));
        System.out.println("Sparse:"+checkSparse(A));
        System.out.println(args.length);
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    
}
