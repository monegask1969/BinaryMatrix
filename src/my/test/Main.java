package my.test;


public class Main {

    public static void main(String[] args) {
        int mat[][] = {{0, 0, 0, 1, 0, 0},
                       {0, 0, 1, 1, 0, 0},
                       {0, 0, 0, 1, 0, 0}};

//        int mat[][] = {{1, 0, 1, 1, 1},
//                       {0, 0, 0, 0, 0},
//                       {0, 0, 0, 0, 0}};

        int maxRow = 0;
        int maxColumn = 0;
        int row = 0, column=0;
        int resRow = 0;
        int resColumn = 0;
        for (int i = 0; i < 3; i++) {
            maxRow = 0;
            for (int j = 0; j < 6; j++) {
                if (mat[i][j] == 1) {
                    maxRow += 1;
                }
                else {
                    maxRow = 0;
                }
                if (maxRow > resRow) {
                    resRow = maxRow;
                    row = i;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            maxColumn = 0;
            for (int j = 0; j < 3; j++) {
                if (mat[j][i] == 1) {
                    maxColumn += 1;
                }
                else{
                    maxColumn = 0;
                }
                if (maxColumn > resColumn) {
                    resColumn = maxColumn;
                    column = i;
                }
            }

        }



        System.out.println("Maximum 1's is " + ((resColumn > resRow) ? resColumn:resRow));

        System.out.println("Row, that has max 1's: " + (row+1));
        System.out.println("Column, that has max 1's: " + (column+1));

    }
}