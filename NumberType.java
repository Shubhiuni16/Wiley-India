import java.util.Scanner;

class NumCheck{
    private long num;
    int[] f=new int[10];
    int[] c = new int[10];
    NumCheck(){

    }
    NumCheck(long num){
        this.num=num;
    }
    public long getNum() {
        return num;
    }
    public void setNum(long num) {
        this.num = num;
    }    
    public void cubeSet(){
        for(int i=0;i<10;i++){
            c[i]=i*i*i;
        }
    }
    public void factSet(){
        f[0]=1;
        for(int i=1;i<10;i++){
            f[i]=i*f[i-1];
        }
    }
    public long reverse(){
        long temp=num;
        long rev = 0;  
        while(temp != 0){  
            long rem = temp % 10;  
            rev = rev * 10 + rem;  
            temp = temp/10;  
        } 
        return rev; 
    }
    public boolean checkPalindrome(){
        boolean ans=num==reverse()?true:false;
        return ans;
    }
    public boolean checkArmstrong(){
        long temp=num;
        cubeSet();
        int s=0;
        while(temp!=0){
            long rem=temp%10;
            s=s+c[(int)rem];
            temp=temp/10;
        }
        return s==num?true:false;
    }
    public boolean checkSpecial(){
        long temp=num;
        factSet();
        int s=0;
        while(temp!=0){
            long rem=temp%10;
            s=s+f[(int)rem];
            temp=temp/10;
        }
        return s==num?true:false;
    }
    public void allCheck(){
        boolean palindrome=checkPalindrome();
        boolean special=checkSpecial();
        boolean armstrong=checkArmstrong();
        if((palindrome||special||armstrong)==false){
            System.out.println(reverse());
        }
        if(palindrome)
            System.out.println("PALINDROME");
        if(armstrong)
            System.out.println("ARMSTRONG");
        if(special)
            System.out.println("SPECIAL");
    }
}
public class NumberType {
    public static void main(String[] args) {
        long num;
        Scanner sc=new Scanner(System.in); 
        num=sc.nextLong();
        NumCheck t=new NumCheck();
        t.setNum(num);
        t.allCheck();
        sc.close();
    }
}
