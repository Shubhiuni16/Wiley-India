public class VariableDeclaration {
    public static void print(String s) { 
        System.out.println(s); 
    } 
    public static void main(String[] args)  {
        byte b=100;
        short s=1000;
        int i=10000000;
        long l=10000000;
        float f=-1.23f;
        double d=12E100;
        char c='\u0000';
        boolean bool=true;
        Void v=null;
        print(b+"\n"+s+"\n"+i+"\n"+l+"\n"+f+"\n"+d+"\n"+c+"\n"+bool+"\n"+v);
    }
}
