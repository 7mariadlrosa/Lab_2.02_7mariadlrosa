package onetwo;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

class TDDTest {

    //Test 1
    @Test
    void testArrays(){
        //Odd array and even positive
        assertArrayEquals(new int[]{1, 3, 5}, TDD.arrayOdd(5));

        //Odd array and odd positive
        assertArrayEquals(new int[]{1, 3, 5}, TDD.arrayOdd(6));

        //Odd array and zero empty array
        assertArrayEquals(new int[]{}, TDD.arrayOdd(0));

        //Odd array and negative value
        assertArrayEquals(new int[]{}, TDD.arrayOdd(-3));
    }

    //Test 2

    @Test

    void testKeywords(){
        assertEquals(true, TDD.findIfContainsKeywords("Don't break my heart"));

        assertEquals(false, TDD.findIfContainsKeywords("Don't break my heart"));

        assertEquals(false, TDD.findIfContainsKeywords(""));
        assertEquals(false, TDD.findIfContainsKeywords(" "));
    }
}
