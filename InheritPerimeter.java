//Ashish Ranjan Roll No. 21
import java.util.*;
public class InheritPerimeter {
    static class square {
        int side;
        Scanner sc=new Scanner(System.in);
        square() {
            System.out.print("Enter the length of side: ");
            side=sc.nextInt();
        }
        void perimeter() {
            System.out.println("The perimeter of square is "+(side*4)+" sq. units.");
        }
        int getside() {return side;}
    }
    static class rectangle extends square {
        int breadth;
        Scanner sc=new Scanner(System.in);
        rectangle() {
            super();
            System.out.print("Enter the length of breadth: ");
            breadth=sc.nextInt();
        }
        void perimeter() {
            super.perimeter();
            int length=getside();
            System.out.println("The perimeter of rectangle is "+(2*(length+breadth))+" sq. units.");
        }
        int getbreadth() {return breadth;}
    }
    static class triangle extends rectangle {
        int side3;
        Scanner sc=new Scanner(System.in);
        triangle() {
            super();
            System.out.print("Enter the length of third side: ");
            side3=sc.nextInt();
        }
        void perimeter() {
            super.perimeter();
            int side1=getside();
            int side2=getbreadth();
            System.out.println("The perimeter of triangle is "+(side1+side2+side3)+" sq. units.");
        }
    }
    public static void main(String[] args) {
        triangle t1=new triangle();
        t1.perimeter();
    }
}