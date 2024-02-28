//Ashish Ranjan Roll No. 21
import java.util.*;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no. of rows for matrix 1: ");
        int a=sc.nextInt();
        System.out.print("Enter no. of columns for matrix 1: ");
        int b=sc.nextInt();
        System.out.print("Enter no. of rows for matrix 2: ");
        int x=sc.nextInt();
        System.out.print("Enter no. of columns for matrix 2: ");
        int y=sc.nextInt();
        System.out.println();

        if (x!=a || y!=b) System.out.println("Cannot Add Matrices as dimensions are unequal.");
        else {
            int[][] mat1=new int[a][b];
            System.out.println("Enter Elements of Matrix 1:");
            for (int i=0;i<a;i++) {
                for (int j=0;j<b;j++) {
                    System.out.print("Enter Element of row "+i+" and column "+j+": ");
                    mat1[i][j]=sc.nextInt();
                }
            }
            int[][] mat2=new int[x][y];
            System.out.println("Enter Elements of Matrix 2:");
            for (int i=0;i<x;i++) {
                for (int j=0;j<y;j++) {
                    System.out.print("Enter Element of row "+i+" and column "+j+": ");
                    mat2[i][j]=sc.nextInt();
                }
            }
            int[][] mat3=new int[x][y];
            for (int i=0;i<x;i++) {
                for (int j=0;j<y;j++) mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
            System.out.println();
            System.out.println("Matrix 1:");
            for (int i=0;i<a;i++) {
                for (int j=0;j<b;j++) System.out.print(mat1[i][j]+" ");
                System.out.println();
            }
            System.out.println("Matrix 2:");
            for (int i=0;i<x;i++) {
                for (int j=0;j<y;j++) System.out.print(mat2[i][j]+" ");
                System.out.println();
            }
            System.out.println("Matrix 3=Matrix1 1 + Matrix 2:");
            for (int i=0;i<x;i++) {
                for (int j=0;j<y;j++) System.out.print(mat3[i][j]+" ");
                System.out.println();
            }
        }
        sc.close();
    }
}
