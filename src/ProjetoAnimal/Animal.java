package ProjetoAnimal;

public class Animal {
    private String nome;
    private String raca;


    //Construtor em que o objeto pode ficar sem nome
    public Animal() {

    }

    //Construtor em que o objeto deve receber um nome
    public Animal(String nome) {
        this.nome = nome;
    }

    //Métodos publicos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    //outras funções
    public String caminha(){
        return "Caminhando...";
    }
}
