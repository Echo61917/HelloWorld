package JUnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMethodTest {
    SimpleMethod testMethod = new SimpleMethod();

    @Test
    void getArea() {
    }

    @Test
    void standardAssertions(){
        assertEquals(30, testMethod.getArea(5,6));
    }



}