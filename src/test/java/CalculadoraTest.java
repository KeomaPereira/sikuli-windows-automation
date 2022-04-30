import junit.framework.Assert;
import org.junit.jupiter.api.*;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.net.URISyntaxException;

public class CalculadoraTest {

    static Screen screen;

    @BeforeEach
    void setScreen() {
        screen = new Screen();
    }

    @AfterEach
   void closeCalculadora() throws FindFailed, URISyntaxException {
        Calculadora.fecharCalculadora(screen);
    }

    @Test
    @DisplayName("Deve abrir a calculadora do windows com sucesso")
    public void deveAbrirCalculadora() throws FindFailed, URISyntaxException, InterruptedException {
        Calculadora.abrirCalculadora(screen);
        Assert.assertTrue(Calculadora.isCalculadoraAberta(screen));
    }

}