import org.junit.Test;
import static org.junit.Assert.*;

public class PruebasTest {

    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(8, calc.sumar(4, 4));
        assertEquals(-2, calc.sumar(-5, 3));
    }
    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(3, calc.restar(8, 5));
        assertEquals(8, calc.restar(5, -3));
    }
    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(16, calc.multiplicar(4, 4));
        assertEquals(-12, calc.multiplicar(4, -3));
    }
    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.dividir(10, 2), 0.0001);
        assertEquals(-2.0, calc.dividir(8, -4), 0.0001);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorCero() {
        Calculadora calc = new Calculadora();
        calc.dividir(4, 0);
    }
}
