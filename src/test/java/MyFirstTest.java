//import
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class MyFirstTest {
    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();
    @Before
    public void setUpValues(){
        arrayList.add(1);
        arrayList.add(2);
        arrayList2.add(1);
        arrayList2.add(2);
    }

    @Test
    public void testObjectSameness(){
        // this won't work because while the values are the same, the reference isn't
        assertSame(arrayList, arrayList2);
    }

    @Test
    public void additionMethodTest(){
        long input1 = 20;
        long input2 = 30;
        long expected = 50;
        assertEquals(expected, MathOps.add(input1, input2));
    }

    @Test
    public void tipAppTest(){
        double cost = 22.56;
        double tip = 20;
        double expected = 4.51;

        assertEquals(expected, MathOps.tip(cost, tip), 0.005);
    }

    @Test
    public void testArrayEquality(){
        int[] startArray = {1, 2, 3, 4, 5};
        int[] endArray = {2,3,4,5,6};

        assertArrayEquals(endArray, MathOps.addOneToArray(startArray));
    }

    public static void main(String[] args) {
        int[] startArr = {1,2,3,4,5};
        int[] endArr = {2,3,4,5,6};
    }
}
