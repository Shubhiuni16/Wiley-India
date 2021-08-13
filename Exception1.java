public class Exception1 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,1};
        try{
            try{
                System.out.println(a[5]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("EXCEPTIION: "+e);
            }
            System.out.println(a[3]/(a[4]-a[0]));
        }catch(ArithmeticException e){
            System.out.println("EXCEPTIION: "+e);
        }
        System.out.println("SUCCESSFULLY EXECUTED");
    }
    
}
