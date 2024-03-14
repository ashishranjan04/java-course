//Ashish Ranjan Roll No. 21
import java.util.*;
public class ParameterConstruct {
    String name;
    int roll;
    int id;
    double marks;

    ParameterConstruct(String name,int roll,int id,double marks){
        this.name=name;
        this.roll=roll;
        this.id=id;
        this.marks=marks;
    }

    public void disp(){
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+roll);
        System.out.println("ID: "+id);
        System.out.println("Marks: "+marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int n=sc.nextInt();
        ParameterConstruct[] arr=new ParameterConstruct[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter name of Student"+(i+1)+": ");
            String name=sc.next();
            System.out.print("\nEnter Roll No. of Student"+(i+1)+": ");
            int roll=sc.nextInt();
            System.out.print("\nEnter ID of Student"+(i+1)+": ");
            int id=sc.nextInt();
            System.out.print("\nEnter marks of Student"+(i+1)+": ");
            double marks=sc.nextDouble();
            arr[i]=new ParameterConstruct(name, roll, id, marks);
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.println("Details of Student"+(i+1)+":");
            arr[i].disp();
        }
        sc.close();
    }
}
