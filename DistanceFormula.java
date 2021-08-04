import java.util.*;

public class DistanceFormula {

    public static double scanDouble(String message,Scanner s){
        System.out.println(message);
        double d;
        d=s.nextDouble();
        return d;
    }

    public static double square(double x){
        return x*x;
    }

    public static double squareRoot(double x){  
        double t;
        double sqrt = x / 2;
        do {
            t = sqrt;
            sqrt = (t + (x / t)) / 2;
        } while ((t - sqrt) != 0);
        //System.out.print("number="+x+"SQRT="+sqrt+"\n");
        return sqrt; 
    }  
    public static void main(String[] args)  {
        double x1,y1,x2,y2,distance;
        Scanner s = new Scanner(System.in); 
        x1=scanDouble("Abscissa for first coordinate(x1)=", s);
        y1=scanDouble("Ordinate for first coordinate(y1)=", s);
        x2=scanDouble("Abscissa for first coordinate(x2)=", s);
        y2=scanDouble("Ordinate for first coordinate(y2)=", s);
        distance=squareRoot((square(x2-x1)+square(y2-y1)));
        System.out.printf("Distance between the two coordinates is %.2f", distance);
    }
}
