//Ashish Ranjan Roll No. 21
import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter length of Array: ");
        int n=sc.nextInt();

        int[] a= new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println("Array in Ascending Order:");
        for (int i=0;i<n;i++) System.out.println(a[i]+" ");

        for (int i=0;i<n-1;i++) {
            for (int j=0;j<n-i-1;j++) {
                if (a[j]<a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println("Array in Descending Order:");
        for (int i=0;i<n;i++) System.out.println(a[i]+" ");

        sc.close();
    }
}