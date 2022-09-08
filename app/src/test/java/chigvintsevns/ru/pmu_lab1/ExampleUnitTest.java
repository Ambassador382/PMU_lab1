package chigvintsevns.ru.a2lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    chigvintsevns.ru.a2lab1.MinMax minMax = new chigvintsevns.ru.a2lab1.MinMax();
    @Test
    public void minTest1() {
        //arr
        int[] result = new int[1];
        int[] expected = new int[1];
        expected[0] = 1;
        int a = 1;
        int b = 2;
        //act
        result[0] = minMax.min2(a, b);
        //assert
        assertArrayEquals(expected, result);
    }
    @Test
    public void minTest2() {
        //arr
        int[] result = new int[1];
        int[] expected = new int[1];
        expected[0] = 1;
        int a = 2;
        int b = 1;
        //act
        result[0] = minMax.min2(a, b);
        //assert
        assertArrayEquals(expected, result);
    }
    @Test
    public void maxTest1() {
        //arr
        int[] result = new int[1];
        int[] expected = new int[1];
        expected[0] = 2;
        int a = 1;
        int b = 2;
        //act
        result[0] = minMax.max2(a, b);
        //assert
        assertArrayEquals(expected, result);
    }
    @Test
    public void maxTest2() {
        //arr
        int[] result = new int[1];
        int[] expected = new int[1];
        expected[0] = 2;
        int a = 2;
        int b = 1;
        //act
        result[0] = minMax.max2(a, b);
        //assert
        assertArrayEquals(expected, result);
    }
}