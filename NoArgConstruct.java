//Ashish Ranjan Roll No. 21
public class NoArgConstruct {

    String name;
    int rollno;
    int id;
    float marks;

    NoArgConstruct(){
        this.name="Abc Xyz";
        this.rollno=10;
        this.id=8614;
        this.marks=78;
    }
    public void disp(){
        System.out.println("Name of Student: "+name);
        System.out.println("Roll No.: "+rollno);
        System.out.println("Student ID: "+id);
        System.out.println("Marks: "+marks);
    }
    public static void main(String[] args) {
        NoArgConstruct s1= new NoArgConstruct();
        s1.disp();
        }
}
