package estrategia;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MuteSoundTest {
    private MuteSound ms;
    private ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        ms = new MuteSound();
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void quack() {
        ms.sound();
        assertTrue(out.toString().toLowerCase().contains("i cannot make sound"));
    }

    @Test
    public void testToString() {
        String esperado = "mutesound{}";
        String obtenido = ms.toString().toLowerCase();
        assertEquals(esperado, obtenido);
    }
}