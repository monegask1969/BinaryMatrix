package my.test;

public class Finder {

    public static int findMaxSequence(int[][] array) {
        int[] rowsMax = new int[array.length];
        int[] columnsMax = new int[array[0].length];

        int maxOfRows = 0;
        int maxOfColums = 0;

        for (int row = 0; row < rowsMax.length; row++) {
            for (int column = 0; column < columnsMax.length; column++) {
                int item = array[row][column];
                if (item == 0) {
                    if( rowsMax[row] > maxOfRows) {
                        maxOfRows = rowsMax[row];
                    }
                    if(columnsMax[column] > maxOfColums) {
                        maxOfColums = columnsMax[column];
                    }
                    rowsMax[row] = 0;
                    columnsMax[column] = 0;
                } else {
                    rowsMax[row] += 1;
                    columnsMax[column] += 1;
                }
            }
        }
        for (int row = 0; row < rowsMax.length; row++) {
            if (rowsMax[row] > maxOfRows) {
                maxOfRows = rowsMax[row];
            }
        }
        for (int column = 0; column < columnsMax.length; column++) {
            if (columnsMax[column] > maxOfColums) {
                maxOfColums = columnsMax[column];
            }
        }
        return maxOfRows > maxOfColums ? maxOfRows : maxOfColums;
    }

}
