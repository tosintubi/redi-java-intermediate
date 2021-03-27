package homework5;

import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        System.out.println(" Sum of the matrix diagonal is : "+matrixDiagonals());
    }


    public static int matrixDiagonals(){
        Scanner sc = new Scanner(System.in);

        int i,j,row,col,sum=0;
        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        col = sc.nextInt();

        int[][] mat = new int[row][col];

        System.out.println("Enter the elements of the matrix") ;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print("Row:  "+ (i+1) +" Col: "+(j+1)+" ==> ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the matrix") ;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println("");
        }

        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(i==j) //this condition checks for diagonal
                {
                    sum = sum + mat[i][j];
                }
            }
        }
        return sum;
    }
}
