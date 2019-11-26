package com.zmt.test.calculate;

import com.zmt.java.calculate.Add;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AddTest {
    @Test
    public void testAdd() {
        Add add = new Add(1,3);
        assertTrue( add.getResult() == 4 );
    }
}
