public class MethodOverloading {
    static double perimeter(double a){
        return 4*a;
    }
    static double perimeter(double a,double b){
        return 2*(a+b);
    }
    static double perimeter(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println(perimeter(2.5,2));
        System.out.println(perimeter(2));
        System.out.println(perimeter(2.5,2,2.5));
    }
}
