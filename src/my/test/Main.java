package my.test;

import static my.test.MatrixFunc.rowWithMax1s;

public class Main {
    
    public static void main(String[] args)
    {
        int mat[][] = { { 0, 0, 0, 1, 0, 0},
                        { 0, 0, 1, 1, 0, 0},
                        { 0, 0, 0, 1, 0, 0}};
        System.out.println("Index of row with maximum 1s is "
                + rowWithMax1s(mat));
    }
}
