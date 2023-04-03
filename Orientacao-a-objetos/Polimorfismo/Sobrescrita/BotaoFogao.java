package Sobrescrita;

public class BotaoFogao extends Botao {

    @Override
    public void ligar() {
        System.out.println("ligue o gás");

    }

    @Override
    public void desligar() {
        super.desligar();
    }

}