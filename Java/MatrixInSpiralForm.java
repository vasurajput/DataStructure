/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Java;

/**
 *
 * @author Vasu Rajput
 */
public class MatrixInSpiralForm {

    public static void main(String[] args) {
        int row = 3;
        int col = 6;
        int[][] arr = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18}
        };

        printMatrixInSpiral(row, col, arr);
    }

    private static void printMatrixInSpiral(int rowEndM, int colEndN, int[][] arr) {

        //m= ending row index
        //n = ending col index
        //l = starting column index
        //k = starting row index
        int rowStartK = 0, colStartL = 0;

        while (rowStartK < rowEndM && colStartL < colEndN) {
            for (int i = colStartL; i < colEndN; ++i) {
                System.out.print(" " + arr[rowStartK][i] + " ");
            }
            rowStartK++;
            for (int i = rowStartK; i < rowEndM; ++i) {
                System.out.print(" " + arr[i][colEndN - 1] + " ");
            }
            colEndN--;
            if (rowStartK < rowEndM) {
                for (int i = colEndN - 1; i >= colStartL; --i) {
                    System.out.print(" " + arr[rowEndM - 1][i] + " ");
                }
                rowEndM--;
            }

            if (colStartL < colEndN) {
                for (int i = rowEndM - 1; i >= rowStartK; --i) {
                    System.out.print(" " + arr[i][colStartL] + " ");
                }
                colStartL++;
            }
        }

    }
}
