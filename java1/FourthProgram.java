/*Create a two dimensional array of integers and display:

sum of all elements of each column
sum of all elements of each row */
public class FourthProgram {
    public static void main(String[] args) {
        int rows, cols, sumRow, SumCol;
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rows = a.length;
        cols = a[0].length;

        for (int i = 0; i < rows; i++) {
            sumRow = 0;
            for (int j = 0; j < cols; j++) {
                sumRow = sumRow + a[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
        }

        for (int i = 0; i < cols; i++) {
            SumCol = 0;
            for (int j = 0; j < rows; j++) {
                SumCol = SumCol + a[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " Column: " + SumCol);
            System.out.println(a[0][1]);
        }
    }

}
