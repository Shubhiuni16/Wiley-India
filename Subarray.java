import java.util.*;
public class Subarray {
    public static boolean subarray(int[] a,int[] b,int n,int m){
        Arrays.sort(a);  
        Arrays.sort(b);   
        int t=0; 
        int i=0;
        boolean f=true;
        for(i=0;i<n;++i){
            while(t<m){
                if(a[i]==b[t]){
                    t++;
                    break;
                }
                else{
                    t++;
                }
            }
            if(t==m){
                break;
            }
        }
        if(i<n&&t==m){
            f=false;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []a=new int[n];
        int []b=new int[m];
        for(int i=0;i<n;++i){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;++i){
            b[i]=sc.nextInt();
        }
        System.out.print(subarray(a,b,n,m));
        sc.close();
        
    }
}
