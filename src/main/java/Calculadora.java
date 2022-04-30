import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import java.net.URISyntaxException;

public class Calculadora {

    public static void abrirCalculadora(Screen screen) throws FindFailed, InterruptedException, URISyntaxException {
        screen.click(getBasePath() + "windows-start.png");
        Thread.sleep(2000);
        screen.type("calc"  + Key.ENTER);
        Thread.sleep(2000);
    }

    public static Boolean isCalculadoraAberta(Screen screen) throws URISyntaxException {
        return screen.exists(getBasePath() + "calc.png", 6) != null;
    }

    public static void fecharCalculadora(Screen screen) throws URISyntaxException, FindFailed {
        if (isCalculadoraAberta(screen)) {
            screen.click(getBasePath() + "close-button.png");
        }
    }

    public static String getBasePath() throws URISyntaxException {
        return Calculadora.class.getClassLoader().getResource("images").toURI().getPath() + "/";
    }

}