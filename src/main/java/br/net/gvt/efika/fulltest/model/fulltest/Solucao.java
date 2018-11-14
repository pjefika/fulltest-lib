package br.net.gvt.efika.fulltest.model.fulltest;

/**
 * Tiago Henrique Iwamoto
 * tiago.iwamoto@telefonica.com
 * System Analyst
 * 41 9 9104-6051
 **/
@SuppressWarnings("all")
public class Solucao {

    private Integer id;
    private String problema;
    private String solucao;
    private Boolean leituraConfirmada;

    public Solucao() {
    }

    public Solucao(String problema, String solucao) {
        this.problema = problema;
        this.solucao = solucao;
    }

    public Solucao(Integer id, String problema, String solucao) {
        this.id = id;
        this.problema = problema;
        this.solucao = solucao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getLeituraConfirmada() {
        return leituraConfirmada;
    }

    public void setLeituraConfirmada(Boolean leituraConfirmada) {
        this.leituraConfirmada = leituraConfirmada;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Solucao{");
        sb.append("id=").append(id);
        sb.append(", problema='").append(problema).append('\'');
        sb.append(", solucao='").append(solucao).append('\'');
        sb.append(", leituraConfirmada=").append(leituraConfirmada);
        sb.append('}');
        return sb.toString();
    }
}
