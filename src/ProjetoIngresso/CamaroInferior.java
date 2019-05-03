package ProjetoIngresso;

public class CamaroInferior extends Vip{
    private String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void mostrarLocalizacao(){
        System.out.println(getLocalizacao());
    }
}
