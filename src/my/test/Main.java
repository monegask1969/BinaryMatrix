package my.test;


import static my.test.Finder.findMaxSequence;

public class Main {

    public static void main(String[] args) {
        int array[][] = {{0, 0, 0, 1, 0, 0},
                         {0, 0, 1, 1, 0, 0},
                         {0, 0, 0, 1, 0, 0}};


        System.out.println("Highest count is " + findMaxSequence(array));

    }

}