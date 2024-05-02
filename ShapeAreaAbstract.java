//Ashish Ranjan Roll No. 21
import java.util.*;
abstract class AbstractShape {
    private int r,h;
    Scanner sc=new Scanner(System.in);

    public AbstractShape() {
        System.out.println("Enter radius,height:");
        r=sc.nextInt();
        h=sc.nextInt();
        sc.close();
    }

    abstract double area();

    public int getr() {
        return r;
    }
    public int geth() {
        return h;
    }
}
class cone extends AbstractShape {
    cone() {
        super();
    }
    double area() {
        int r=getr();
        int h=geth();
        double a=(Math.PI)*r*(r+Math.pow((r*r)+(h*h),0.5));
        return a;
    }
}
class cylinder extends AbstractShape {
    cylinder() {
        super();
    }
    double area() {
        int r=getr();
        int h=geth();
        double a=(2*(Math.PI)*r)*(h+r);
        return a;
    }
}
public class ShapeAreaAbstract {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for cone, 2 for cylinder");
        int choice=sc.nextInt();
        switch(choice) {
            case 1:
            cone c1=new cone();
            double a1=c1.area();
            System.out.println("Area of cone: "+a1);
            break;
            case 2:
            cylinder c2=new cylinder();
            double a2=c2.area();
            System.out.println("Area of cylinder: "+a2);
            break;
            default: System.out.println("Invalid Choice");
        }
        sc.close();
    }
}