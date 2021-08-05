import java.util.*;
class MyOperator{
    public int operator(int x,int y){
        return x+y;
    }
    public String operator(String x,String y){
        return x.concat(y);
    }
    public String operator(int x,String y){
        String a=Integer.toString(x);  
        return a.concat(y);
    }
    public void singleFunc(String x,String y){
        boolean n1 = true;
        boolean n2 = true;
        int p=0,q=0;
        try {
            p = Integer.parseInt(x);
        } catch (NumberFormatException e) {
            n1 = false;
        }
        try {
            q = Integer.parseInt(y);
        } catch (NumberFormatException e) {
            n2 = false;
        }
        if(n1&&n2){
            System.out.print(p+q);
        }
        else{
            System.out.print(x.concat(y));
        }
    }
}
public class operatorOverloading {
    public static void main(String[] args) {
        MyOperator c1=new MyOperator();
        System.out.print(c1.operator("Hi","hello")+"\n");
        Scanner sc=new Scanner(System.in); 
        MyOperator c2=new MyOperator();
        c2.singleFunc(sc.nextLine(),sc.nextLine());
        sc.close();
    }
}

//*****************SOLUTION USING instanceOf and using objects**********************

/* import java.util.*;
public class Main
{
    public static void find(Object op1, Object op2)
    {
        if( op1 instanceof String || op2 instanceof String)
        System.out.println(String.valueOf(op1) + String.valueOf(op2));
        
         else if ( op1 instanceof Integer && op2 instanceof Integer)
         {
        System.out.println(Integer.valueOf(String.valueOf(op1)) + Integer.valueOf(String.valueOf(op2)));
    }}

    
	public static void main(String[] args) 
	{
	 
	 find(10,20);
	}
}

 */


//******************Solution using object other approach***************************

/* class Overloading {
    public void function(Object a, Object b) {
//        System.out.println(a.getClass());
//        System.out.println(a.getClass().getSuperclass());
//        System.out.println(a.getClass().getSuperclass().getName());
//        System.out.println(a.getClass().getSuperclass().getSimpleName());
        if (a.getClass().getSuperclass().getSimpleName().equals("Number") && b.getClass().getSuperclass().getSimpleName().equals("Number")) {
            System.out.println(Double.parseDouble(a.toString()) + Double.parseDouble(b.toString()));
        } else {
            System.out.println(a.toString().concat("—").concat(b.toString()));
        }
    }
}
public class OperatorOverLoading {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.function(10,0);
    }
}

 */