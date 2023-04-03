

//SUBCLASSE HERDA METODOS E COMPORTAMENTOS DE UMA SUPERCLASSE
//SEMELHANTE A HERANÇA DA VIDA REAL
//CLASSE BASE POSSUI SERIE DE METODOS
//QUEM HERDA É OBRIGADO A USAR
public class PessoaDesenvolvedora {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    private String stack;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    private Double salario;

    public PessoaDesenvolvedora(String nome, String stack, Double salario) {
        this.nome = nome;
        this.stack = stack;
        this.salario = salario;
    }
    public void codar(){
        System.out.println("bora codar WEB");
    }

}
