public class Profissional {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //só são visíveis dentro da classe que estão
    private  Double salario;
    private Integer id;
         //acessível por qualquer classe
        public Double salarioPublic;
        public Integer idPublic;

        //acessível pela classe que o declare, suas subclasses em outros pacotes
        //e outras classes do mesmo pacote
        protected Double salarioProtected;
       public Integer idProtected;

       public String trabalharPublic(){
           return "trabalhando public";
       }

       protected String trabalharProtected(){
           return "trabalhando protected";
       }

       private String trabalharPrivate(){
           return "trabalhando private";
       }










}
