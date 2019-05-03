package ProjetoImovel;

public class Velho extends Imovel{
    private double desconto;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void impressao(){
        System.out.println("O valor dos imoveis é "+getPreco());
        System.out.println("O valor do desconto para imoveis velhos é "+getDesconto());
        System.out.println("O valor de um imovel velho é "+(getPreco() - getDesconto()));
    }
}