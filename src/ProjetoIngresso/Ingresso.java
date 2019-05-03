package ProjetoIngresso;

public class Ingresso {
    private double valor;

    public Ingresso() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimeValor(){
        System.out.println(getValor());
    }
}
