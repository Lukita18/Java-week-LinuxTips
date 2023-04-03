//POLIMORFISMO -> MESMA PARTE DO PROGRAMA DE VÁRIAS FORMAS DIFERENTES PARA NECESSIDADES DIFERENTES
//SOBRECARGA: VARIAÇÕES DE UM MESMO METODO COM A LISTA DE ARGUMENTOS E RETORNO DIFERENTES(ASSINATURA)

//EXEMPLO DE SOBRECARGA

public class Pagamento {


    //PAGAMENTO A VISTA
    public Double pagamento(Double valor) {
        return valor;
    }


    //CALCULA O VALOR DAS PARCELAS
    public Integer pagamento(Integer valorInteger, Integer parcelas) {
        return valorInteger / parcelas;
    }


    //JUROS
    public Long pagamento(Integer valorInteger, Integer parcelas, Long juros) {
        return (valorInteger / parcelas) + juros;
    }


}
