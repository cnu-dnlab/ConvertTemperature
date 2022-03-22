package cnu.cse;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {   
        assertTrue( true );
    }

    @Test //상속 여부 확인
    public void testInheritance() {
        Impl impl = new Impl();

        assertTrue(impl instanceof Temperature);
        assertTrue(impl instanceof Impl);
        assertFalse(((Object) impl) instanceof Integer);
        assertFalse(((Object) impl) instanceof Integer[]);
        assertFalse(((Object) impl) instanceof String);
        assertFalse(((Object) impl) instanceof String[]);
    }

    @Test
    public void testGetFahrenheit() {
        Impl impl = new Impl();        
        impl.setCelsius(4.5);
        assertEquals(Double.valueOf(40.1), impl.getFahrenheit(), 0.0000000000001);
        impl.setCelsius(16.0);
        assertEquals(Double.valueOf(60.8), impl.getFahrenheit(), 0.0000000000001);
        impl.setCelsius(27.0);
        assertEquals(Double.valueOf(80.6), impl.getFahrenheit(), 0.0000000000001);
        impl.setCelsius(48.0);
        assertEquals(Double.valueOf(118.4), impl.getFahrenheit(), 0.0000000000001);
        impl.setCelsius(49.5);
        assertEquals(Double.valueOf(121.1), impl.getFahrenheit(), 0.0000000000001);
    }

    @Test
    public void testGetCelsius() {
        Impl impl = new Impl();
        impl.setFahrenheit(45.5);
        assertEquals(Double.valueOf(7.5), impl.getCelsius(), 0.0000000000001);
        impl.setFahrenheit(41.0);
        assertEquals(Double.valueOf(5.0), impl.getCelsius(), 0.0000000000001);
        impl.setFahrenheit(36.5);
        assertEquals(Double.valueOf(2.5), impl.getCelsius(), 0.0000000000001);
        impl.setFahrenheit(32.0);
        assertEquals(Double.valueOf(0.0), impl.getCelsius(), 0.0000000000001);
        impl.setFahrenheit(9.5);
        assertEquals(Double.valueOf(-12.5), impl.getCelsius(), 0.0000000000001);
    }
}
