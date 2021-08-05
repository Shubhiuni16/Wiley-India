import java.util.Scanner;

class MyClass{
    private int var1;
    private int var2;
    private int var3;
    
    public int getVar1() {
        return var1;
    }
    public void setVar1(int var1) {
        this.var1 = var1;
    }
    public int getVar2() {
        return var2;
    }
    public void setVar2(int var2) {
        this.var2 = var2;
    }
    public int getVar3() {
        return var3;
    }
    public void setVar3(int var3) {
        this.var3 = var3;
    }
    
    MyClass(int var1,int var2,int var3){
        this.var1=var1;
        this.var2=var2;
        this.var3=var3;
    }
    public int compare(){
        int ans;
        ans=(var1>=var2)?(var1>=var3?var1:var3):(var2>=var3?var2:var3);
        return ans;
    }
    public void allPrime(){
        if(isPrime(var1)){
            System.out.print(var1+"\t");
        }
        if(isPrime(var2)){
            System.out.print(var2+"\t");
        }
        if(isPrime(var3)){
            System.out.print(var3+"\t");
        }
    }
    public boolean isPrime(int n) {  
        if (n <= 1) {  
            return false;  
        }  
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }  
}  

public class TernaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1=sc.nextInt();
        int var2=sc.nextInt();
        int var3=sc.nextInt();
        MyClass c1 = new MyClass(var1,var2,var3);
        System.out.print("\n"+c1.compare()+"\n");
        c1.allPrime();
        sc.close();
    }

}
