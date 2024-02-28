//Ashish Ranjan Roll No. 21
import java.util.*;

public class BookArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the total number of books: ");
        int n=sc.nextInt();

        String[] title=new String[n];
        String[] author=new String[n];
        int[] bookid=new int[n];
        float[] price=new float[n];

        for (int i=0;i<n;i++) {
            System.out.println("Enter Details of Book "+(i+1));
            System.out.print("Enter Book Title: ");
            title[i]=sc.nextLine();
            sc.nextLine();
            System.out.print("Enter Author Name: ");
            author[i]=sc.nextLine();
            System.out.print("Enter Book ID: ");
            bookid[i]=sc.nextInt();
            System.out.print("Enter Book Price: ");
            price[i]=sc.nextFloat();
            System.out.println();
        }

        System.out.println("Details of Books with price above 500:");
        for (int i=0;i<n;i++) {
            if (price[i]>500) {
                System.out.println("Book Title: "+title[i]);
                System.out.println("Author Name: "+author[i]);
                System.out.println("Book ID: "+bookid[i]);
                System.out.println("Book Price: "+price[i]);
                System.out.println();
            }
        }
        sc.close();
    }
}
