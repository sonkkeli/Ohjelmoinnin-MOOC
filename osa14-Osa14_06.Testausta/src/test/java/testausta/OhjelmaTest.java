package testausta;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class OhjelmaTest {

    // toteuta tänne testit luokkaa Ohjelma-varten
    
    @Test
    public void testaaSuoritaYksi() {
        assertEquals("Pulloja: 6\nOppilaita: 3\nKeskiarvo: 2.0", Ohjelma.suorita(new Scanner("3\n2\n1\n-1\n")));
    }
    
    @Test
    public void testaaSuoritaKaksi() {
        assertEquals("Pulloja: 1\nOppilaita: 2\nKeskiarvo: 0.5", Ohjelma.suorita(new Scanner("1\n0\n-55\n-1\n")));
    }
    
    @Test
    public void testaaSuoritaKolme() {
        assertEquals("Pulloja: 0\nOppilaita: 0\nKeskiarvoa ei voida laskea", Ohjelma.suorita(new Scanner("-55\n-1\n")));
    }
    
}
