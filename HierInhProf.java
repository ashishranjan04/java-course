//Ashish Ranjan Roll No. 21
import java.util.Scanner;
class professional {
    String name;
    int age;
    professional() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Name: ");
        name=sc.next();
        System.out.print("Enter Age: ");
        age=sc.nextInt();
    }
    void display() {
        System.out.println("\nName is "+name);
        System.out.println("Age is "+age);
    }
}
class engineer extends professional {
    String branch,company;
    engineer() {
        super();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Branch: ");
        branch=sc.next();
        System.out.print("Enter Company Name: ");
        company=sc.next();
    }
    void display() {
        super.display();
        System.out.println("\nBranch is "+branch);
        System.out.println("Company Name is "+company);
    }
}
class doctor extends professional {
    String spl;
    int numCases;
    doctor() {
        super();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Specialisation: ");
        spl=sc.next();
        System.out.print("Enter Number of Cases: ");
        numCases=sc.nextInt();
    }
    void display() {
        super.display();
        System.out.println("\nSpecialisation is "+spl);
        System.out.println("Number of Cases is "+numCases);
}
}
public class HierInhProf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 for Doctor, 2 for Engineer: ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                doctor d1=new doctor();
                d1.display();
                break;
            case 2:
                engineer e1=new engineer();
                e1.display();
                break;
            default:
                break;
        }
        sc.close();
    }
}