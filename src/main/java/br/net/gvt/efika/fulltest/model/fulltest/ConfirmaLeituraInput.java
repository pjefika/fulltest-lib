package br.net.gvt.efika.fulltest.model.fulltest;

/**
 * Tiago Henrique Iwamoto
 * tiago.iwamoto@telefonica.com
 * System Analyst
 * 41 9 9104-6051
 **/
@SuppressWarnings("all")
public class ConfirmaLeituraInput{

    private String fulltest;
    private Solucao solucao;

    public ConfirmaLeituraInput() {
    }

    public String getFulltest() {
        return fulltest;
    }

    public void setFulltest(String fulltest) {
        this.fulltest = fulltest;
    }

    public Solucao getSolucao() {
        return solucao;
    }

    public void setSolucao(Solucao solucao) {
        this.solucao = solucao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfirmaLeituraInput{");
        sb.append("fulltest='").append(fulltest).append('\'');
        sb.append(", solucao=").append(solucao);
        sb.append('}');
        return sb.toString();
    }
}
