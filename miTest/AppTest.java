package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static LlamadaTelefonica lt1, lt2;

    @BeforeAll public static void setUp() {
        lt1 = new LlamadaTelefonicaEntrante("XYZ", "1234567890", 1);
        lt2 = new LlamadaTelefonicaSaliente("XYZ", "1234567890", 10, 2);
    }

    @Test public void testPrecio() {
        assertTrue(((LlamadaTelefonicaEntrante)(lt1)).getPrecio()==1.0);
    }

    @Test public void testMinutos() {
        assertTrue(((LlamadaTelefonicaSaliente)lt2).getDuracion()==10.0);
    }

    @Test public void testCostoLlamada1() {
        assertTrue(lt1.costoLlamada()==1.0);
    }

    @Test public void testCostoLlamada2() {
        assertTrue(lt2.costoLlamada()==20.0);
    }
}