//Ashish Ranjan Roll No. 21
import java.util.*;
public class DefaultConstruct {
    String name;
    int roll;
    int id;
    double marks;
    static Scanner sc=new Scanner(System.in);

    DefaultConstruct(){
        System.out.print("Enter name of Student: ");
        this.name=sc.next();
        System.out.print("\nEnter Roll No. of Student: ");
        this.roll=sc.nextInt();
        System.out.print("\nEnter ID of Student: ");
        this.id=sc.nextInt();
        System.out.print("\nEnter marks of Student: ");
        this.marks=sc.nextDouble();
    }

    public void disp(){
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+roll);
        System.out.println("ID: "+id);
        System.out.println("Marks: "+marks);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Enter number of Students: ");
        int n=sc.nextInt();
        DefaultConstruct[] arr=new DefaultConstruct[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Details for Student"+(i+1)+":");
            arr[i]=new DefaultConstruct();
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.println("Details of Student"+(i+1)+":");
            arr[i].disp();
        }
        sc.close();
    }
}
