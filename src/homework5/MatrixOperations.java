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
        for(i=0; i<row ;i++)
        {
            for(j=0; j<col; j++)
            {
                System.out.print("Row: "+ (i+1) +" Col: "+(j+1)+" ==> ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Elements of the matrix");
        System.out.println("==========================") ;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("==========================") ;

        // Computes the sum of the diagonals of the matrix
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {

                int val1 = 10;
                int val2 = 20;

                int max = val1 >= val2 ? val1 : val2;

                sum = (i==j) ? (sum + mat[i][j]) : sum;

//                if(i==j)
//                {
//                    sum = sum + mat[i][j];
//                }
            }
        }
        return sum;
    }
}
