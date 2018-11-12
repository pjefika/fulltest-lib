package br.net.gvt.efika.fulltest.model.fulltest;

/**
 * Tiago Henrique Iwamoto
 * tiago.iwamoto@telefonica.com
 * System Analyst
 * 41 9 9104-6051
 **/
@SuppressWarnings("all")
public class Solucao {

    private String problema;
    private String solucao;

    public Solucao() {
    }

    public Solucao(String problema, String solucao) {
        this.problema = problema;
        this.solucao = solucao;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Solucao{");
        sb.append("problema='").append(problema).append('\'');
        sb.append(", solucao='").append(solucao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
