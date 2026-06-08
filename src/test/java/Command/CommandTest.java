package Command;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommandTest {

    @Test
    void deveLigarLuz() {

        Luz luz = new Luz();

        Command ligar = new LigarLuzCommand(luz);

        ControleRemoto controle = new ControleRemoto();
        controle.setComando(ligar);

        controle.pressionarBotao();

        assertTrue(luz.isLigada());
    }

    @Test
    void deveDesligarLuz() {

        Luz luz = new Luz();
        luz.ligar();

        Command desligar = new DesligarLuzCommand(luz);

        ControleRemoto controle = new ControleRemoto();
        controle.setComando(desligar);

        controle.pressionarBotao();

        assertFalse(luz.isLigada());
    }

    @Test
    void deveExecutarComandosDiferentes() {

        Luz luz = new Luz();

        ControleRemoto controle = new ControleRemoto();

        controle.setComando(new LigarLuzCommand(luz));
        controle.pressionarBotao();

        assertTrue(luz.isLigada());

        controle.setComando(new DesligarLuzCommand(luz));
        controle.pressionarBotao();

        assertFalse(luz.isLigada());
    }
}
