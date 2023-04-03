package Sobrescrita;

public class BotaoTV extends  Botao{
 @Override
    public void  ligar(){
     super.ligar();
 }

@Override
    public void desligar(){
     System.out.println("Programando a tv para desligar em 20 minutos");
}




}
