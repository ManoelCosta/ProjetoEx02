package ProjetoImovel;

public class Imovel {
    private String endereco;
    private double preco;

    public Imovel() {
    }

    public Imovel(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
