package ProjetoImovel;

public class Velho extends Imovel{
    private double desconto;

    public Velho() {
    }

    public Velho(String endereco) {
        super(endereco);
    }


    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void novoPreco(){
        System.out.println(desconto + getPreco());
    }
}
