/* interface Drawable{
    static final double maxArea=5000;
    void area();
    void perimeter();
    default void displayMaxArea(){
        System.out.println(maxArea);
    }
    default public void getName(){
        System.out.println("Its a "+this.getClass().getName());
    }
}
class Rectangle implements Drawable{
    private int l;
    private int b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        int area=l*b;
        System.out.println("AREA: "+area);
        if(area>maxArea){
            System.out.println("AREA MORE THAN MAX VALUE");
        }
    }
    public void perimeter(){
        System.out.println("PERIMETER: "+(2*(l+b)));
    }

}
class Square implements Drawable{
    private int l;
    Square(int l){
        this.l=l;
    }
    public void area(){
        int area=l*l;
        System.out.println("AREA: "+area);
        if(area>maxArea){
            System.out.println("AREA MORE THAN MAX VALUE");
        }
    }
    public void perimeter(){
        System.out.println("PERIMETER: "+(4*(l)));
    }

}
class Circle implements Drawable{
    private int r;
    Circle(int r){
        this.r=r;
    }
    public void area(){
        double area=Math.PI*r*r;
        System.out.println("AREA: "+area);
        if(area>maxArea){
            System.out.println("AREA MORE THAN MAX VALUE");
        }
    }
    public void perimeter(){
        System.out.println("PERIMETER: "+(Math.PI*r*2));
    }

}
class Triangle implements Drawable{
    private int a,b,c;
    Triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void area(){
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("AREA: "+area);
        if(area>maxArea){
            System.out.println("AREA MORE THAN MAX VALUE");
        }
    }
    public void perimeter(){
        System.out.println("PERIMETER: "+(a+b+c));
    }
    public void getName(){
        System.out.println("Its a triangle");
    }

}

class interfaceDrawable{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(2,4);
        Square s=new Square(4);
        Circle c=new Circle(4);
        Triangle t=new Triangle(4, 5, 3);

        r.area();
        r.displayMaxArea();

        c.perimeter();
        c.area();
        c.displayMaxArea();

        s.area();

        t.area();
        t.getName();
    }
} */

class interfaceDrawable {
    public static void main(String[] args) {
        System.out.println("InterfaceSideEffects.main()");
        Impl i = new Impl();
        System.out.println("Impl initialized");
        i.bla();
        System.out.println("Impl instance method invoked");
        Foo f = new Impl();
        System.out.println("Impl initialized and assigned to Foo");
        f.bla();
        System.out.println("Foo interface method invoked");
    }
}

interface Foo {
    int dummy = Bar.haveSideEffect();

    void bla();
    
}

class Bar {
    static int haveSideEffect() {
        System.out.println("interface Foo initialized");
        return 0;
    }
}

class Impl implements Foo {
    public void bla() {
        System.out.println(dummy);
    }
}
