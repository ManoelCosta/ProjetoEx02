package ProjetoImovel;

public class Novo extends Imovel{
    private double adicional;

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void impressao(){
        System.out.println("O valor dos imoveis é "+getPreco());
        System.out.println("O valor do adicional para imoveis novos é "+getAdicional());
        System.out.println("O valor de um imovel novo é de: "+ (getPreco() + getAdicional()));
    }
}
