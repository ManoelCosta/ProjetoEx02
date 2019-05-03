package ProjetoIngresso;

public class CamaroteSuperior extends Vip{
    private String localizacao;
    private double adicional;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void valorIngressoVipSuperior(){
        System.out.println((valorIngressoVip() + getAdicional()));
    }
}
