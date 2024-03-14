//Ashish Ranjan Roll No. 21
import java.util.*;
public class StringOper{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String 1:");
        String s1=sc.nextLine();
        s1=s1.trim();
        System.out.print("\nEnter String 2:");
        String s2=sc.nextLine();
        s2=s2.trim();
        System.out.println();
        System.out.println("Length of String 1: "+s1.length());
        System.out.println("Length of String 2: "+s2.length());
        System.out.println("String 1 in lowercase: "+s1.toLowerCase());
        System.out.println("String 2 in lowercase: "+s2.toLowerCase());
        System.out.println("String 1 in Uppercase: "+s1.toUpperCase());
        System.out.println("String 2 in Uppercase: "+s2.toUpperCase());
        System.out.println();
        System.out.println("Choose from following String Operations:");
        System.out.println("1. Compare");
        System.out.println("2. Merge");
        System.out.println("3. Substring");
        System.out.print("Enter your Choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Strings are equal: "+s1.equalsIgnoreCase(s2));
            break;
            case 2:
            System.out.println("Merged String is: "+s1.concat(s2));
            break;
            case 3:
            System.out.print("Enter Start & End Index: ");
            int start=sc.nextInt();
            int end=sc.nextInt();
            System.out.println("Substring of String 1: "+s1.substring(start,end));
            System.out.println("Substring of String 2: "+s2.substring(start,end));
            break;
            default:
            System.out.println("Invalid Choice");
            break;
        }
        sc.close();
    }
}