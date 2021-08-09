public class Array{
    public static int[] reverse(int[] a){
        int n=a.length;
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j-1] = a[i];
            j--;
        }
        return b;
    }
    public static int max(int[] a){
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
    public static int min(int[] a){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(min>a[i]){
                min=a[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int[] a={1,4,2,3,5,7};
        int[] r=reverse(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(r[i]+",");
        }
        System.out.println("\nMax="+max(a));
        System.out.println("Min="+min(a));
    }
}