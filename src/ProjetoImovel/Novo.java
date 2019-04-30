package ProjetoImovel;

public class Novo extends Imovel{

    private double adicional;

    public Novo() {
    }

    public Novo(String endereco) {
        super(endereco);
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void novoPreco(){
        System.out.println(adicional + getPreco());
    }
}
