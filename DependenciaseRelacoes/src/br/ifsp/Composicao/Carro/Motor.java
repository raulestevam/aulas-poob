package br.ifsp.Composicao.Carro;

public class Motor {
    private String potencia;
    private int cilindradas;
    private String tipoCompustivel;
    private int numCilindros;

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoCompustivel() {
        return tipoCompustivel;
    }

    public void setTipoCompustivel(String tipoCompustivel) {
        this.tipoCompustivel = tipoCompustivel;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }
}
