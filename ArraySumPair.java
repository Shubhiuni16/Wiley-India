import java.util.*;
 
class ArraySumPair {
    public static void find(int A[],int n, int sum){
        int l, r;
        l = 0;
        r = n - 1;
        while (l < r) {
            if (A[l] + A[r] == sum){
                System.out.println(A[l]+" "+A[r]);
                l++;
                r--;
            }
            else if (A[l] + A[r] < sum)
                l++;
            else
                r--;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
        find(A,n,k);
        sc.close();
    }
}
