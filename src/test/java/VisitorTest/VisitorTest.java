package VisitorTest;

import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(17, 170, 22.50);
    }
    @Test
    public void hasAge(){
        assertEquals(17, visitor.getAge());
    }
    @Test
    public void hasHeight(){
        assertEquals(170, visitor.getHeight());
    }
    @Test
    public void hasMoney(){
        assertEquals(22.50, visitor.getMoney(), 0.01);
    }
}
