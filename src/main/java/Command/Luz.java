package Command;

//controle de luz
public class Luz {

    private boolean ligada = false;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public boolean isLigada(){
        return ligada;
    }
}
