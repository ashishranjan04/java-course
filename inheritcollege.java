//Ashish Ranjan Roll No.21
import java.util.*;
public class inheritcollege{
    static class college{
        Scanner sc=new Scanner(System.in);
        private String clg_name;
        private String clg_city;
        public void acceptCollege(){
            System.out.println("Enter the college name: ");
            clg_name=sc.next();
            System.out.println("Enter the college city");
            clg_city=sc.next();
        }
        public void displayCollege(){
            System.out.println("Name of the college is: "+clg_name);
            System.out.println("City in which college is present: "+clg_city);
        }
    }
    static class course extends college{
        private String degree, branch;
        public void acceptCourse(){
            System.out.println("Enter the degree name: ");
            degree=sc.next();
            System.out.println("Enter the branch name: ");
            branch=sc.next();
        }
        public void displayCourse(){
            System.out.println("Name of the degree: "+degree);
            System.out.println("Name of the branch is: "+branch);
        }
    }
    static class subject extends course{
        private String subject1, subject2;
        public void acceptSubject(){
            System.out.println("Enter the subject1 name: ");
            subject1=sc.next();
            System.out.println("Enter the subject2 name: ");
            subject2=sc.next();
        }
        public void displaySubject(){
            System.out.println("Name of the subject1: "+subject1);
            System.out.println("Name of the subject2 is: "+subject2);
        }
    }

    public static void main(String[] args) {
        subject c1=new subject();
        c1.acceptCollege();
        c1.acceptCourse();
        c1.acceptSubject();
        c1.displayCollege();
        c1.displayCourse();
        c1.displaySubject();
    }
}