package my.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class FinderTest {

    @Test
    public void findMaxSequence() {

        int array[][] = {{0, 0, 0, 1, 0, 0},
                         {0, 0, 1, 1, 0, 0},
                         {0, 0, 0, 1, 0, 0}};

        int actual = Finder.findMaxSequence(array);
        int expected = 3;
        assertEquals(actual,expected);

    }

    @Test
    public void findMaxSequence2(){
        int array[][] = {{0, 0, 0, 1, 0, 0},
                         {1, 1, 1, 1, 0, 1},
                         {0, 0, 0, 1, 0, 0}};

        int actual = Finder.findMaxSequence(array);
        int expected = 4;
        assertEquals(actual,expected);
    }

    @Test
    public void findMaxSequence3(){
        int array[][] = {{0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 1}};

        int actual = Finder.findMaxSequence(array);
        int expected = 1;
        assertEquals(actual,expected);
    }

}