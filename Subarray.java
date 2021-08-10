import java.util.*;
public class Subarray {
    static boolean subarray(int[] a,int[] b,int n,int m){
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
    static boolean checkCondition(int[] a,int[] b,int n,int m){
        int c=0;
        for(int i=0;i<n;++i){
            boolean found=false;
            for(int j=0;j<m;++j){
                if(a[i]==b[j]){
                    found=true;
                    break;
                }
            }
            if(found==false){
                c++;
            }
        }
        if(c==1){
            return true;
        }
        else{
            return false;
        }
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
        boolean ans=subarray(a,b,n,m);
        System.out.println(ans);
        if(ans==false){
            System.out.println(checkCondition(a,b,n,m));
        }
        sc.close();
        
    }
}
