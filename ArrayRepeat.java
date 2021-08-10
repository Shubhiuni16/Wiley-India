import java.util.*;
public class ArrayRepeat {

    //// ONE ELEMENT REPEATED

    /* public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+1];
        int sum=0;
        for(int i=0;i<=n;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        int ans=sum-(n*(n+1)/2);
        System.out.println(ans);
        int f=0;
        for(int i=0;i<n;i++){
            if(ans==a[i]&&f<1){
                f++;
            }
            if(f>=1){
                int temp=a[i+1];
                a[i]=temp;
            }
            System.out.print(a[i]+" ");
        }
        sc.close();
    } */

    // 0, 2, 2, 0, 1
    static void findDuplicateNumber(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int j = Math.abs(num[i]);
            if (num[j] > 0) {
                num[j] = -(num[j]);
            } 
            else {
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String args[]){
        //Scanner sc= new Scanner(System.in);
        //int n=sc.nextInt();
        //int[] a=new int[n+1];
        /* for(int i=0;i<=n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int tSum=0;
        for(int i=0;i<=n;i++){
            int sum=tSum;
            tSum=tSum^a[i];
            System.out.println("SUM="+sum+"  "+"TSUM="+tSum);
            if(sum>=tSum){
                System.out.println(a[i]);
            }
        } */
        System.out.println("The duplicate numbers are::");
        findDuplicateNumber(new int[] { 0, 2, 2, 0, 1 });
    }
}

