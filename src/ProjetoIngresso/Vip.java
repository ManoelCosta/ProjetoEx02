package ProjetoIngresso;

public class Vip extends Ingresso{
    private double valorAdicional;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double valorIngressoVip(){
        return (getValor() + getValorAdicional());
    }
}
